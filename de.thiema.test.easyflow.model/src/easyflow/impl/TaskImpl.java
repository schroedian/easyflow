/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import easyflow.DataCriterion;
import easyflow.DataFormat;
import easyflow.EasyflowPackage;
import easyflow.SplitCriterion;
import easyflow.Task;

import easyflow.TraversalCriterion;
import java.util.Collection;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.impl.TaskImpl#getDataCriterion <em>Data Criterion</em>}</li>
 *   <li>{@link easyflow.impl.TaskImpl#getDataFormatIn <em>Data Format In</em>}</li>
 *   <li>{@link easyflow.impl.TaskImpl#getDataFormatOut <em>Data Format Out</em>}</li>
 *   <li>{@link easyflow.impl.TaskImpl#getCardinalityIn <em>Cardinality In</em>}</li>
 *   <li>{@link easyflow.impl.TaskImpl#getCardinalityOut <em>Cardinality Out</em>}</li>
 *   <li>{@link easyflow.impl.TaskImpl#getIsMultipleInstanceOfDataCriterion <em>Is Multiple Instance Of Data Criterion</em>}</li>
 *   <li>{@link easyflow.impl.TaskImpl#getSplitCriterion <em>Split Criterion</em>}</li>
 *   <li>{@link easyflow.impl.TaskImpl#getTraversalCriterion <em>Traversal Criterion</em>}</li>
 *   <li>{@link easyflow.impl.TaskImpl#getParentTasks <em>Parent Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataCriterion() <em>Data Criterion</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<DataCriterion> dataCriterion;

	/**
	 * The cached value of the '{@link #getDataFormatIn() <em>Data Format In</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormatIn()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFormat> dataFormatIn;

	/**
	 * The cached value of the '{@link #getDataFormatOut() <em>Data Format Out</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormatOut()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFormat> dataFormatOut;

	/**
	 * The default value of the '{@link #getCardinalityIn() <em>Cardinality In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityIn()
	 * @generated
	 * @ordered
	 */
	protected static final short CARDINALITY_IN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinalityIn() <em>Cardinality In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityIn()
	 * @generated
	 * @ordered
	 */
	protected short cardinalityIn = CARDINALITY_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinalityOut() <em>Cardinality Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityOut()
	 * @generated
	 * @ordered
	 */
	protected static final short CARDINALITY_OUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinalityOut() <em>Cardinality Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityOut()
	 * @generated
	 * @ordered
	 */
	protected short cardinalityOut = CARDINALITY_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMultipleInstanceOfDataCriterion() <em>Is Multiple Instance Of Data Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMultipleInstanceOfDataCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMultipleInstanceOfDataCriterion() <em>Is Multiple Instance Of Data Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMultipleInstanceOfDataCriterion()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMultipleInstanceOfDataCriterion = IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSplitCriterion() <em>Split Criterion</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<SplitCriterion> splitCriterion;

	/**
	 * The cached value of the '{@link #getTraversalCriterion() <em>Traversal Criterion</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversalCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<TraversalCriterion> traversalCriterion;

	/**
	 * The cached value of the '{@link #getParentTasks() <em>Parent Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> parentTasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected TaskImpl() {
		super();
		dataCriterion=new BasicEList<DataCriterion>();
		dataFormatIn=new BasicEList<DataFormat>();
		dataFormatOut=new BasicEList<DataFormat>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EasyflowPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataCriterion> getDataCriterion() {
		if (dataCriterion == null) {
			dataCriterion = new EDataTypeUniqueEList<DataCriterion>(DataCriterion.class, this, EasyflowPackage.TASK__DATA_CRITERION);
		}
		return dataCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFormat> getDataFormatIn() {
		if (dataFormatIn == null) {
			dataFormatIn = new EDataTypeUniqueEList<DataFormat>(DataFormat.class, this, EasyflowPackage.TASK__DATA_FORMAT_IN);
		}
		return dataFormatIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFormat> getDataFormatOut() {
		if (dataFormatOut == null) {
			dataFormatOut = new EDataTypeUniqueEList<DataFormat>(DataFormat.class, this, EasyflowPackage.TASK__DATA_FORMAT_OUT);
		}
		return dataFormatOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getCardinalityIn() {
		return cardinalityIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityIn(short newCardinalityIn) {
		short oldCardinalityIn = cardinalityIn;
		cardinalityIn = newCardinalityIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.TASK__CARDINALITY_IN, oldCardinalityIn, cardinalityIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getCardinalityOut() {
		return cardinalityOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityOut(short newCardinalityOut) {
		short oldCardinalityOut = cardinalityOut;
		cardinalityOut = newCardinalityOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.TASK__CARDINALITY_OUT, oldCardinalityOut, cardinalityOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMultipleInstanceOfDataCriterion() {
		return isMultipleInstanceOfDataCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultipleInstanceOfDataCriterion(Boolean newIsMultipleInstanceOfDataCriterion) {
		Boolean oldIsMultipleInstanceOfDataCriterion = isMultipleInstanceOfDataCriterion;
		isMultipleInstanceOfDataCriterion = newIsMultipleInstanceOfDataCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.TASK__IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION, oldIsMultipleInstanceOfDataCriterion, isMultipleInstanceOfDataCriterion));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SplitCriterion> getSplitCriterion() {
		if (splitCriterion == null) {
			splitCriterion = new EDataTypeUniqueEList<SplitCriterion>(SplitCriterion.class, this, EasyflowPackage.TASK__SPLIT_CRITERION);
		}
		return splitCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraversalCriterion> getTraversalCriterion() {
		if (traversalCriterion == null) {
			traversalCriterion = new EDataTypeUniqueEList<TraversalCriterion>(TraversalCriterion.class, this, EasyflowPackage.TASK__TRAVERSAL_CRITERION);
		}
		return traversalCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getParentTasks() {
		if (parentTasks == null) {
			parentTasks = new EObjectResolvingEList<Task>(Task.class, this, EasyflowPackage.TASK__PARENT_TASKS);
		}
		return parentTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void readTask(String wtplLine) {
		String[] wtplArray=wtplLine.split("\t");
		setName(wtplArray[0]);
		
		String[] tmp=wtplArray[5].split(",");
		//System.out.println(tmp.toString()+" "+tmp.length+" "+wtplArray[5]+" "+tmp[0]+" "+
		//		DataFormat.values().toString()+" "+DataFormat.getByName("FASTQ")+" "+dataFormatIn.toString());

		//dataFormatIn.add(DataFormat.getByName("FASTQ"));
		for (int i=0;i<tmp.length;i++) {
			//System.out.println(tmp[i]);
			dataFormatIn.add(DataFormat.getByName(tmp[i]));
		}
        tmp=wtplArray[6].split(",");
        for (int i=0;i<tmp.length;i++)
        	dataFormatOut.add(DataFormat.getByName(tmp[i]));
        

        tmp=wtplArray[7].split(",");
		for (int i=0;i<tmp.length;i++)
			dataCriterion.add(DataCriterion.getByName(tmp[i]));
		
		if (wtplArray[9].equals("n"))
            cardinalityIn=Short.MAX_VALUE;
		else
            cardinalityIn=new Short(wtplArray[9]);
		
		if (wtplArray[10].equals("n"))
            cardinalityOut=Short.MAX_VALUE;
		else
            cardinalityOut=new Short(wtplArray[10]);
        //implementation=wtpl[2]
        //traversalCriteria=wtplArray[8]
        //splitBy=wtplArray[12]
        isMultipleInstanceOfDataCriterion=wtplArray[11].equals("Y") ? true : false;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EasyflowPackage.TASK__NAME:
				return getName();
			case EasyflowPackage.TASK__DATA_CRITERION:
				return getDataCriterion();
			case EasyflowPackage.TASK__DATA_FORMAT_IN:
				return getDataFormatIn();
			case EasyflowPackage.TASK__DATA_FORMAT_OUT:
				return getDataFormatOut();
			case EasyflowPackage.TASK__CARDINALITY_IN:
				return getCardinalityIn();
			case EasyflowPackage.TASK__CARDINALITY_OUT:
				return getCardinalityOut();
			case EasyflowPackage.TASK__IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION:
				return getIsMultipleInstanceOfDataCriterion();
			case EasyflowPackage.TASK__SPLIT_CRITERION:
				return getSplitCriterion();
			case EasyflowPackage.TASK__TRAVERSAL_CRITERION:
				return getTraversalCriterion();
			case EasyflowPackage.TASK__PARENT_TASKS:
				return getParentTasks();
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
			case EasyflowPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case EasyflowPackage.TASK__DATA_CRITERION:
				getDataCriterion().clear();
				getDataCriterion().addAll((Collection<? extends DataCriterion>)newValue);
				return;
			case EasyflowPackage.TASK__DATA_FORMAT_IN:
				getDataFormatIn().clear();
				getDataFormatIn().addAll((Collection<? extends DataFormat>)newValue);
				return;
			case EasyflowPackage.TASK__DATA_FORMAT_OUT:
				getDataFormatOut().clear();
				getDataFormatOut().addAll((Collection<? extends DataFormat>)newValue);
				return;
			case EasyflowPackage.TASK__CARDINALITY_IN:
				setCardinalityIn((Short)newValue);
				return;
			case EasyflowPackage.TASK__CARDINALITY_OUT:
				setCardinalityOut((Short)newValue);
				return;
			case EasyflowPackage.TASK__IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION:
				setIsMultipleInstanceOfDataCriterion((Boolean)newValue);
				return;
			case EasyflowPackage.TASK__SPLIT_CRITERION:
				getSplitCriterion().clear();
				getSplitCriterion().addAll((Collection<? extends SplitCriterion>)newValue);
				return;
			case EasyflowPackage.TASK__TRAVERSAL_CRITERION:
				getTraversalCriterion().clear();
				getTraversalCriterion().addAll((Collection<? extends TraversalCriterion>)newValue);
				return;
			case EasyflowPackage.TASK__PARENT_TASKS:
				getParentTasks().clear();
				getParentTasks().addAll((Collection<? extends Task>)newValue);
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
			case EasyflowPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EasyflowPackage.TASK__DATA_CRITERION:
				getDataCriterion().clear();
				return;
			case EasyflowPackage.TASK__DATA_FORMAT_IN:
				getDataFormatIn().clear();
				return;
			case EasyflowPackage.TASK__DATA_FORMAT_OUT:
				getDataFormatOut().clear();
				return;
			case EasyflowPackage.TASK__CARDINALITY_IN:
				setCardinalityIn(CARDINALITY_IN_EDEFAULT);
				return;
			case EasyflowPackage.TASK__CARDINALITY_OUT:
				setCardinalityOut(CARDINALITY_OUT_EDEFAULT);
				return;
			case EasyflowPackage.TASK__IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION:
				setIsMultipleInstanceOfDataCriterion(IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION_EDEFAULT);
				return;
			case EasyflowPackage.TASK__SPLIT_CRITERION:
				getSplitCriterion().clear();
				return;
			case EasyflowPackage.TASK__TRAVERSAL_CRITERION:
				getTraversalCriterion().clear();
				return;
			case EasyflowPackage.TASK__PARENT_TASKS:
				getParentTasks().clear();
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
			case EasyflowPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EasyflowPackage.TASK__DATA_CRITERION:
				return dataCriterion != null && !dataCriterion.isEmpty();
			case EasyflowPackage.TASK__DATA_FORMAT_IN:
				return dataFormatIn != null && !dataFormatIn.isEmpty();
			case EasyflowPackage.TASK__DATA_FORMAT_OUT:
				return dataFormatOut != null && !dataFormatOut.isEmpty();
			case EasyflowPackage.TASK__CARDINALITY_IN:
				return cardinalityIn != CARDINALITY_IN_EDEFAULT;
			case EasyflowPackage.TASK__CARDINALITY_OUT:
				return cardinalityOut != CARDINALITY_OUT_EDEFAULT;
			case EasyflowPackage.TASK__IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION:
				return IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION_EDEFAULT == null ? isMultipleInstanceOfDataCriterion != null : !IS_MULTIPLE_INSTANCE_OF_DATA_CRITERION_EDEFAULT.equals(isMultipleInstanceOfDataCriterion);
			case EasyflowPackage.TASK__SPLIT_CRITERION:
				return splitCriterion != null && !splitCriterion.isEmpty();
			case EasyflowPackage.TASK__TRAVERSAL_CRITERION:
				return traversalCriterion != null && !traversalCriterion.isEmpty();
			case EasyflowPackage.TASK__PARENT_TASKS:
				return parentTasks != null && !parentTasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", dataCriterion: ");
		result.append(dataCriterion);
		result.append(", dataFormatIn: ");
		result.append(dataFormatIn);
		result.append(", dataFormatOut: ");
		result.append(dataFormatOut);
		result.append(", cardinalityIn: ");
		result.append(cardinalityIn);
		result.append(", cardinalityOut: ");
		result.append(cardinalityOut);
		result.append(", isMultipleInstanceOfDataCriterion: ");
		result.append(isMultipleInstanceOfDataCriterion);
		result.append(", splitCriterion: ");
		result.append(splitCriterion);
		result.append(", TraversalCriterion: ");
		result.append(traversalCriterion);
		result.append(')');
		return result.toString();
	}

	public boolean equals(Object task) {
		if (getName().equals(((Task) task).getName()))
			return true;
		else return false;
	}
	private volatile int hashCode = 0;
	public int hashCode() {
		final int multiplier = 23;
        if (hashCode == 0) {
            int code = 133;
            code = multiplier * code + name.getBytes().hashCode();
            hashCode = code;
        }
        return hashCode;
	}

} //TaskImpl
