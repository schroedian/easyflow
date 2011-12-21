/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import easyflow.DataFormat;
import easyflow.DataProcessingType;
import easyflow.EasyflowPackage;
import easyflow.Task;
import easyflow.WorkflowUtil;

import org.eclipse.emf.common.notify.NotificationChain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.Map.Entry;
import java.util.logging.Logger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Util</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.impl.WorkflowUtilImpl#getLastTaskClassMap <em>Last Task Class Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class WorkflowUtilImpl extends EObjectImpl implements WorkflowUtil {
	static Logger logger=Logger.getLogger("WorkflowLogger");
	/**
	 * The cached value of the '{@link #getLastTaskClassMap() <em>Last Task Class Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTaskClassMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<DataProcessingType, Task> lastTaskClassMap;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowUtilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EasyflowPackage.Literals.WORKFLOW_UTIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<DataProcessingType, Task> getLastTaskClassMap() {
		if (lastTaskClassMap == null) {
			lastTaskClassMap = new EcoreEMap<DataProcessingType,Task>(EasyflowPackage.Literals.DATA_PROCESSING_TYPE_TO_TASK, DataProcessingTypeToTaskImpl.class, this, EasyflowPackage.WORKFLOW_UTIL__LAST_TASK_CLASS_MAP);
		}
		return lastTaskClassMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getAllTasks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void updateLastTaskClass(EList<DataFormat> dataFormatIn, EList<DataFormat> dataFormatOut, Task task) {
		Iterator<DataFormat> in=dataFormatIn.iterator();
		

		//System.out.println(dataFormatIn.size()+" "+dataFormatOut.size());
		while (in.hasNext()) {
			DataFormat dFI=in.next();
			//System.out.println(dFI.getName());
			Iterator<DataFormat> out=dataFormatOut.iterator();
			while (out.hasNext()) {
				
				DataProcessingTypeImpl myDPT = new DataProcessingTypeImpl();
				
				DataFormat dFO=out.next();
				//System.out.println(dFI.getName()+" "+dFO.getName());
				myDPT.setDataFormatIn(dFI);
				myDPT.setDataFormatOut(dFO);
				//logger.info("Update Last Task Class Map with: "+dFI+" "+dFO+" "+task.getName());
				updateLastTaskClassMap(myDPT, task);
				//printLastTaskClassMap();
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void updateLastTaskClassMap(DataProcessingType dataProcessingType, Task task) {
		
		if (getLastTaskClassMap().contains(dataProcessingType))
			getLastTaskClassMap().remove(dataProcessingType);
		getLastTaskClassMap().put(dataProcessingType, task);
		
	}

	public void printLastTaskClassMap() {
		Iterator<Entry<DataProcessingType,Task>> it=getLastTaskClassMap().iterator();
		while (it.hasNext()) {
			Entry<DataProcessingType,Task> myEntry=it.next();
			System.out.println(myEntry.getKey().toString()+" "+myEntry.getValue().getName());
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Task> getTasksFromLastTaskClass(EList<DataFormat> dataFormatIn,
			EList<DataFormat> dataFormatOut) {
		EList<Task> tasks=(EList<Task>) new BasicEList<Task>();
		Iterator<DataFormat> in=dataFormatIn.iterator();
		while (in.hasNext()) {
			//System.out.println("in "+i++);
			DataFormat dFI=in.next();
			Iterator<DataFormat> out=dataFormatOut.iterator();
			while (out.hasNext()) {
				//System.out.println("out "+j++);	
				DataProcessingType myDPT=new DataProcessingTypeImpl();
				
				DataFormat dFO=out.next();
				myDPT.setDataFormatIn(dFI);
				myDPT.setDataFormatOut(dFO);
				
				Task t=getTaskFromLastTaskClassMap(myDPT);
				if (t!=null) {
					tasks.add(t);
					
				}
			}	
		}
		return tasks;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Task getTaskFromLastTaskClassMap(DataProcessingType dataProcessingTypeIn) {
		Iterator<Entry<DataProcessingType, Task>> it=getLastTaskClassMap().iterator();
		Map<DataFormat,Task> tmpMap=new HashMap<DataFormat,Task>();
		Task lastTask=null;
		while (it.hasNext()) {
			Entry<DataProcessingType, Task> myEntry=it.next();
			//logger.info(myEntry.getKey().toString()+" "+dataProcessingTypeIn.getDataFormatIn()+" "+dataProcessingType.getDataFormatOut());
			if (myEntry.getKey().isConvertableTo(dataProcessingTypeIn))
				if (tmpMap.isEmpty()) {
					tmpMap.put(myEntry.getKey().getDataFormatIn(), myEntry.getValue());
					lastTask=myEntry.getValue();
				} else if (myEntry.getKey().getDataFormatOut().equals(dataProcessingTypeIn.getDataFormatIn()))
					lastTask=myEntry.getValue();
		}
		
		return lastTask;

	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EasyflowPackage.WORKFLOW_UTIL__LAST_TASK_CLASS_MAP:
				return ((InternalEList<?>)getLastTaskClassMap()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EasyflowPackage.WORKFLOW_UTIL__LAST_TASK_CLASS_MAP:
				if (coreType) return getLastTaskClassMap();
				else return getLastTaskClassMap().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EasyflowPackage.WORKFLOW_UTIL__LAST_TASK_CLASS_MAP:
				((EStructuralFeature.Setting)getLastTaskClassMap()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EasyflowPackage.WORKFLOW_UTIL__LAST_TASK_CLASS_MAP:
				getLastTaskClassMap().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EasyflowPackage.WORKFLOW_UTIL__LAST_TASK_CLASS_MAP:
				return lastTaskClassMap != null && !lastTaskClassMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *//*
	public String getTask1(DataFormat dataFormatIn, DataFormat dataFormatOut) {
		
		Iterator<DataProcessingType> it =lastTaskClassMap.keySet().iterator();
		while (it.hasNext()) {
			DataProcessingType myDPT=it.next();
			if (myDPT.getDataFormatIn().contains(dataFormatIn.get(0)) && 
					myDPT.getDataFormatOut().contains(dataFormatOut.get(0)))
				return lastTaskClassMap.get(myDPT).get(0);
		}
		return "Init";
		
	}*/

} //WorkflowUtilImpl
