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
import easyflow.IWorkflowUtil;

import org.eclipse.emf.common.notify.NotificationChain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.Map.Entry;
import java.util.logging.Logger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.jgraph.graph.DefaultEdge;
import org.jgraph.graph.Edge;
import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.ListenableDirectedGraph;
import org.jgrapht.traverse.BreadthFirstIterator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>I Workflow Util</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * @implements IWorkflowUtil
 * @generated
 */

public class WorkflowUtilImpl extends EObjectImpl implements IWorkflowUtil {
	static Logger logger=Logger.getLogger("WorkflowLogger");
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowUtilImpl() {
		super();
	}

	
	@Override
	public EList<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Task> getTasksFromLastTaskClass(EList<DataFormat> dataFormatIn,
			EList<DataFormat> dataFormatOut, Map<DataProcessingType, Task> lastTaskClassMap) {
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
				
				Task t=getTaskFromLastTaskClassMap(myDPT, lastTaskClassMap);
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
	public Task getTaskFromLastTaskClassMap(DataProcessingType dataProcessingTypeIn, Map<DataProcessingType, Task> lastTaskClassMap) {
		//Iterator<Entry<DataProcessingType, Task>> it=getTaskClassMap
		Iterator<DataProcessingType> it=lastTaskClassMap.keySet().iterator();
		Map<DataFormat,Task> tmpMap=new HashMap<DataFormat,Task>();
		Task lastTask=null;
		while (it.hasNext()) {
			DataProcessingType myDPT=it.next();
			//logger.info(myEntry.getKey().toString()+" "+dataProcessingTypeIn.getDataFormatIn()+" "+dataProcessingType.getDataFormatOut());
			if (myDPT.isConvertableTo(dataProcessingTypeIn))
				if (tmpMap.isEmpty()) {
					tmpMap.put(myDPT.getDataFormatIn(), lastTaskClassMap.get(myDPT));
					lastTask=lastTaskClassMap.get(myDPT);
				} else if (myDPT.getDataFormatOut().equals(dataProcessingTypeIn.getDataFormatIn()))
					lastTask=lastTaskClassMap.get(myDPT);
		}
		
		return lastTask;

	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void updateLastTaskClass(EList<DataFormat> dataFormatIn, EList<DataFormat> dataFormatOut, Task task,
			Map<DataProcessingType, Task> lastTaskClassMap) {
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
				updateLastTaskClassMap(myDPT, task, lastTaskClassMap);
				//printLastTaskClassMap();
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void updateLastTaskClassMap(DataProcessingType dataProcessingType, Task task,
			Map<DataProcessingType, Task> lastTaskClassMap) {

		if (lastTaskClassMap.keySet().contains(dataProcessingType))
			lastTaskClassMap.remove(dataProcessingType);
		lastTaskClassMap.put(dataProcessingType, task);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addTaskListToDAG(ListenableDirectedGraph dag, 
			EList<Task> lastTasks, Task curTask
			) {//EdgeFactory ef) {
		Iterator<Task> it=lastTasks.iterator();
		while (it.hasNext()) {
			Task lastTask=it.next();
			if (dag.containsVertex(lastTask)) {
				//System.out.println("Last Task: add edge: "+curTask.getName()+"->"+lastTask.getName());
				Object res=dag.addEdge(lastTask, curTask);
				//Edge e1=(Edge) ((EdgeFactory) ef).createEdge(lastTask, curTask);
				Edge e=(Edge) dag.getEdge(lastTask, curTask);
				e.setSource(lastTask);
				e.setTarget(curTask);
				//System.out.println("addEdge: "+res);
			}
		}

	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	
	public EList<Task> getTaskByName(Set taskSet, String rawTaskNames) {
		String[] taskNames=rawTaskNames.split(",");
		Iterator<Task> it=taskSet.iterator();
		EList<Task> tasks=new BasicEList<Task>();
		while (it.hasNext()) {
			Task t=it.next();
			//Iterator<String> its=taskNames.iterator();
			for (int i=0;i<taskNames.length;i++) {
			//while (it.hasNext())
				
				//System.out.println(t+" "+ tTest);
				if (t.getName().equals(taskNames[i])) tasks.add(t);
			}
		}
		return tasks;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void printLastTaskClassMap(Map<DataProcessingType, Task> lastTaskClassMap) {
		Iterator<DataProcessingType> it=lastTaskClassMap.keySet().iterator();
		while (it.hasNext()) {
			DataProcessingType myDPT=it.next();
			System.out.println(myDPT.toString()+" "+lastTaskClassMap.get(myDPT).toString());
		}
	}
	
	

	public String getCommandLine(ListenableDirectedGraph dag, Task t) {
		
		String cmd="";
		Set<Edge> edgeSet=dag.edgesOf(t);
		Iterator<Edge> edgeIt=edgeSet.iterator();
		while (edgeIt.hasNext()) {
			Edge edge=edgeIt.next();
			Task task=(Task) edge.getSource();
			Iterator<DataFormat> dataFormatIt=task.getDataFormatIn().iterator();
			//while (dataFormatIt.hasNext()) {
			//	task.getFilesIn(dataFormatIt.next());
			//}
			
		}
		return cmd;
	}
	
	
	public void checkDAG(ListenableDirectedGraph dag) {
		/*
		KruskalMinimumSpanningTree minSpanTree=new KruskalMinimumSpanningTree(dag);
		Set<DefaultEdge> edgeSet=minSpanTree.getEdgeSet();
		Iterator<DefaultEdge> it=edgeSet.iterator();
		while (it.hasNext()) {
			DefaultEdge edge=it.next();
			System.out.println(edge.toString());
			
		}*/
		
		BreadthFirstIterator breadthFirstIt=new BreadthFirstIterator(dag);
		while (breadthFirstIt.hasNext()){
			Task t=(Task) breadthFirstIt.next();
			System.out.print(t.getName()+" ");
			Set<DefaultEdge> edgeSet=dag.incomingEdgesOf(t);
			Iterator<DefaultEdge> it=edgeSet.iterator();
			while (it.hasNext()) {
				DefaultEdge edge=it.next();
				System.out.print(edge.getLeafCount()+" "+
						edge.getLevel()+" "+
						edge.getAttributes()
						);
				//if (! edge.isRoot()) {
					Task st=(Task) edge.getSource();
					t.getParentTasks().add(st);
					System.out.print(": "+st.getName());
				//}
			}
			System.out.println("	#####");
		}
	}

	public void firstDAGWalker(ListenableDirectedGraph dag) {
		/*
		KruskalMinimumSpanningTree minSpanTree=new KruskalMinimumSpanningTree(dag);
		Set<DefaultEdge> edgeSet=minSpanTree.getEdgeSet();
		Iterator<DefaultEdge> it=edgeSet.iterator();
		while (it.hasNext()) {
			DefaultEdge edge=it.next();
			System.out.println(edge.toString());
			
		}*/
		
		BreadthFirstIterator breadthFirstIt=new BreadthFirstIterator(dag);
		while (breadthFirstIt.hasNext()){
			Task t=(Task) breadthFirstIt.next();
			System.out.print(t.getName()+" ");
			Set<DefaultEdge> edgeSet=dag.incomingEdgesOf(t);
			Iterator<DefaultEdge> it=edgeSet.iterator();
			while (it.hasNext()) {
				DefaultEdge edge=it.next();
				System.out.print(edge.getLeafCount()+" "+
						edge.getLevel()+" "+
						edge.getAttributes()
						);
				//if (! edge.isRoot()) {
					Task st=(Task) edge.getSource();
					t.getParentTasks().add(st);
					System.out.print(": "+st.getName());
				//}
			}
			System.out.println("	#####");
		}
	}
	

	

	
	/*
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
