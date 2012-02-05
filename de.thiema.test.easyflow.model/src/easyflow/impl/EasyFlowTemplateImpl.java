/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import easyflow.DataProcessingType;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import easyflow.EasyFlowTemplate;
import easyflow.EasyflowPackage;
import easyflow.Task;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.jgraph.graph.DefaultEdge;
import org.jgraph.graph.Edge;
import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.ListenableDirectedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Easy Flow Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.impl.EasyFlowTemplateImpl#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EasyFlowTemplateImpl extends EObjectImpl implements EasyFlowTemplate {
	
	protected static WorkflowUtilImpl workflowUtil=new WorkflowUtilImpl();
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EasyFlowTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EasyflowPackage.Literals.EASY_FLOW_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.EASY_FLOW_TEMPLATE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ListenableDirectedGraph generateDAGFromTemplateFile(Map<DataProcessingType, Task> lastTaskClassMap) {
		
		ListenableDirectedGraph dag=new ListenableDirectedGraph<easyflow.Task, DefaultEdge>(DefaultEdge.class);
		try {
//			System.out.println(this.getFileName());
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.getFileName()));
            String strLine;
            easyflow.Task rootTask=new TaskImpl();
            rootTask.setName("Root");
            
            EdgeFactory<Task,Edge> ef=dag.getEdgeFactory();
            dag.addVertex(rootTask);
            
            while ((strLine = bufferedReader.readLine()) != null)   {
            	if (!strLine.startsWith("#")) {
                    //System.out.println(strLine);
                    
                    //System.out.println(strLine);
                    /*StringTokenizer st = new StringTokenizer(strLine, "\t");
                    while (st.hasMoreTokens()) {
                            System.out.println(st.nextToken());
                    }*/

                    //create eadge of jgrapht object
                    easyflow.Task curTask=new TaskImpl();
                    curTask.readTask(strLine);
                    //System.out.println(curTask.toString());
                    /*get tasks derived from input data format*/
//                    System.out.println(workflowUtil);
                    EList<Task> lastTasks=workflowUtil.getTasksFromLastTaskClass(
                    		curTask.getDataFormatIn(), curTask.getDataFormatOut(),
                    		lastTaskClassMap
                    		);
                    /*get tasks as defined by parent task definition workflow template file*/
                    
                    EList<Task> parentTasks=workflowUtil.getTaskByName(dag.vertexSet(), strLine.split("\t")[1]);
                    //parentTasks.addAll(lastTasks);
                    //System.out.println(lastTasks+" "+parentTasks);
                    //System.out.println(dag()+" "+curTask.toString());
                    System.out.println(curTask.getName()+"  #depTasks: "
                    		+lastTasks.size()+" "+parentTasks.size()
                    		+" #in/out "+curTask.getDataFormatIn().size()+" "
                    		+curTask.getDataFormatOut().size());
					dag.addVertex(curTask);
					/*add parent Task*/
					int curEdgeSize=dag.edgeSet().size();
					workflowUtil.addTaskListToDAG(dag, parentTasks, curTask);
					/*add last Task*/
					workflowUtil.addTaskListToDAG(dag, lastTasks, curTask);
					/*if (curEdgeSize==dag.edgeSet().size()) {
						dag.addEdge(rootTask, curTask);
						//ef.createEdge(rootTask, curTask);
						System.out.println("Link "+curTask.getName()+" to root node.");
					}*/
					
//					System.out.println("Number of nodes: "+dag.vertexSet().size()+" Number of edges: "+dag.edgeSet().size());
                    //ClassBasedEdgeFactory<Task, DefaultEdge> edgeFactory=new ClassBasedEdgeFactory();
                    //System.out.println(pipeline.getTaskNumber());
					
                    workflowUtil.updateLastTaskClass(curTask.getDataFormatIn(), curTask.getDataFormatOut(), curTask, lastTaskClassMap);
                    //System.out.println(getWorkflowUtil().getLastTaskClassMap().toString());
                    //System.out.println(defaultListenableGraph.toString());
                    //System.out.println(getWorkflowUtil().getLastTaskClassMap().toString());
            	}
            }
            
    } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
    } catch (IOException e) {
    // TODO Auto-generated catch block
            e.printStackTrace();
    /*} finally {
            if (bufferedReader != null) {
                    bufferedReader.close();
            }*/
    }
    return dag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EasyflowPackage.EASY_FLOW_TEMPLATE__FILE_NAME:
				return getFileName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EasyflowPackage.EASY_FLOW_TEMPLATE__FILE_NAME:
				setFileName((String)newValue);
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
			case EasyflowPackage.EASY_FLOW_TEMPLATE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
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
			case EasyflowPackage.EASY_FLOW_TEMPLATE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
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
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

} //EasyFlowTemplateImpl
