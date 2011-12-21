/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import easyflow.DataProcessingType;
import easyflow.EasyFlowConfiguration;
import easyflow.EasyFlowImplementationTemplate;
import easyflow.EasyFlowMetadata;
import easyflow.EasyFlowTemplate;
import easyflow.Task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import easyflow.EasyflowPackage;
import easyflow.Workflow;

import easyflow.WorkflowUtil;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.jgrapht.EdgeFactory;
import org.jgrapht.alg.KruskalMinimumSpanningTree;
import org.jgrapht.graph.ListenableDirectedGraph;
import org.jgraph.graph.DefaultEdge;
import org.jgraph.graph.Edge;
import org.jgrapht.graph.DefaultListenableGraph;
import org.jgrapht.traverse.BreadthFirstIterator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.impl.WorkflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getDag <em>Dag</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getWorkflowTemplateFileName <em>Workflow Template File Name</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getMetadataFileName <em>Metadata File Name</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getWorkflowTemplate <em>Workflow Template</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getImplementationTemplate <em>Implementation Template</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getDataProcessingType <em>Data Processing Type</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getWorkflowUtil <em>Workflow Util</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowImpl extends EObjectImpl implements Workflow {
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
	 * The default value of the '{@link #getDag() <em>Dag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDag()
	 * @generated
	 * @ordered
	 */
	protected static final ListenableDirectedGraph DAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDag() <em>Dag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDag()
	 * @generated
	 * @ordered
	 */
	protected ListenableDirectedGraph dag = DAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkflowTemplateFileName() <em>Workflow Template File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowTemplateFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKFLOW_TEMPLATE_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkflowTemplateFileName() <em>Workflow Template File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowTemplateFileName()
	 * @generated
	 * @ordered
	 */
	protected String workflowTemplateFileName = WORKFLOW_TEMPLATE_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadataFileName() <em>Metadata File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATA_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadataFileName() <em>Metadata File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataFileName()
	 * @generated
	 * @ordered
	 */
	protected String metadataFileName = METADATA_FILE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkflowTemplate() <em>Workflow Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowTemplate()
	 * @generated
	 * @ordered
	 */
	protected EasyFlowTemplate workflowTemplate;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EasyFlowConfiguration configuration;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EasyFlowMetadata metadata;

	/**
	 * The cached value of the '{@link #getImplementationTemplate() <em>Implementation Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationTemplate()
	 * @generated
	 * @ordered
	 */
	protected EasyFlowImplementationTemplate implementationTemplate;

	/**
	 * The cached value of the '{@link #getDataProcessingType() <em>Data Processing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProcessingType()
	 * @generated
	 * @ordered
	 */
	protected DataProcessingType dataProcessingType;

	/**
	 * The cached value of the '{@link #getWorkflowUtil() <em>Workflow Util</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowUtil()
	 * @generated
	 * @ordered
	 */
	protected WorkflowUtil workflowUtil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WorkflowImpl() {
		super();
		//ListenableDirectedGraph<easyflow.Task, DefaultEdge> 
		dag=new ListenableDirectedGraph<easyflow.Task, DefaultEdge>(DefaultEdge.class);
		workflowUtil=new WorkflowUtilImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EasyflowPackage.Literals.WORKFLOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListenableDirectedGraph getDag() {
		return dag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDag(ListenableDirectedGraph newDag) {
		ListenableDirectedGraph oldDag = dag;
		dag = newDag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__DAG, oldDag, dag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkflowTemplateFileName() {
		return workflowTemplateFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflowTemplateFileName(String newWorkflowTemplateFileName) {
		String oldWorkflowTemplateFileName = workflowTemplateFileName;
		workflowTemplateFileName = newWorkflowTemplateFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE_FILE_NAME, oldWorkflowTemplateFileName, workflowTemplateFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetadataFileName() {
		return metadataFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadataFileName(String newMetadataFileName) {
		String oldMetadataFileName = metadataFileName;
		metadataFileName = newMetadataFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__METADATA_FILE_NAME, oldMetadataFileName, metadataFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowTemplate getWorkflowTemplate() {
		if (workflowTemplate != null && workflowTemplate.eIsProxy()) {
			InternalEObject oldWorkflowTemplate = (InternalEObject)workflowTemplate;
			workflowTemplate = (EasyFlowTemplate)eResolveProxy(oldWorkflowTemplate);
			if (workflowTemplate != oldWorkflowTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE, oldWorkflowTemplate, workflowTemplate));
			}
		}
		return workflowTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowTemplate basicGetWorkflowTemplate() {
		return workflowTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflowTemplate(EasyFlowTemplate newWorkflowTemplate) {
		EasyFlowTemplate oldWorkflowTemplate = workflowTemplate;
		workflowTemplate = newWorkflowTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE, oldWorkflowTemplate, workflowTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowConfiguration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (EasyFlowConfiguration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EasyflowPackage.WORKFLOW__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowConfiguration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(EasyFlowConfiguration newConfiguration) {
		EasyFlowConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowMetadata getMetadata() {
		if (metadata != null && metadata.eIsProxy()) {
			InternalEObject oldMetadata = (InternalEObject)metadata;
			metadata = (EasyFlowMetadata)eResolveProxy(oldMetadata);
			if (metadata != oldMetadata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EasyflowPackage.WORKFLOW__METADATA, oldMetadata, metadata));
			}
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowMetadata basicGetMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(EasyFlowMetadata newMetadata) {
		EasyFlowMetadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__METADATA, oldMetadata, metadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowImplementationTemplate getImplementationTemplate() {
		if (implementationTemplate != null && implementationTemplate.eIsProxy()) {
			InternalEObject oldImplementationTemplate = (InternalEObject)implementationTemplate;
			implementationTemplate = (EasyFlowImplementationTemplate)eResolveProxy(oldImplementationTemplate);
			if (implementationTemplate != oldImplementationTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE, oldImplementationTemplate, implementationTemplate));
			}
		}
		return implementationTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowImplementationTemplate basicGetImplementationTemplate() {
		return implementationTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationTemplate(EasyFlowImplementationTemplate newImplementationTemplate) {
		EasyFlowImplementationTemplate oldImplementationTemplate = implementationTemplate;
		implementationTemplate = newImplementationTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE, oldImplementationTemplate, implementationTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessingType getDataProcessingType() {
		if (dataProcessingType != null && dataProcessingType.eIsProxy()) {
			InternalEObject oldDataProcessingType = (InternalEObject)dataProcessingType;
			dataProcessingType = (DataProcessingType)eResolveProxy(oldDataProcessingType);
			if (dataProcessingType != oldDataProcessingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE, oldDataProcessingType, dataProcessingType));
			}
		}
		return dataProcessingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessingType basicGetDataProcessingType() {
		return dataProcessingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProcessingType(DataProcessingType newDataProcessingType) {
		DataProcessingType oldDataProcessingType = dataProcessingType;
		dataProcessingType = newDataProcessingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE, oldDataProcessingType, dataProcessingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowUtil getWorkflowUtil() {
		if (workflowUtil != null && workflowUtil.eIsProxy()) {
			InternalEObject oldWorkflowUtil = (InternalEObject)workflowUtil;
			workflowUtil = (WorkflowUtil)eResolveProxy(oldWorkflowUtil);
			if (workflowUtil != oldWorkflowUtil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EasyflowPackage.WORKFLOW__WORKFLOW_UTIL, oldWorkflowUtil, workflowUtil));
			}
		}
		return workflowUtil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowUtil basicGetWorkflowUtil() {
		return workflowUtil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflowUtil(WorkflowUtil newWorkflowUtil) {
		WorkflowUtil oldWorkflowUtil = workflowUtil;
		workflowUtil = newWorkflowUtil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__WORKFLOW_UTIL, oldWorkflowUtil, workflowUtil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initDag() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateDag() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeMakeflow() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeAWSCloudFormation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void readWorkflowTemplate() {
		try {
            File workflowTpl=new File(workflowTemplateFileName);
            //System.out.println(workflowTemplateFileName);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(workflowTpl));
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
                    EList<Task> lastTasks=getWorkflowUtil().getTasksFromLastTaskClass(
                    		curTask.getDataFormatIn(), curTask.getDataFormatOut());
                    /*get tasks as defined by parent task definition workflow template file*/
                    EList<Task> parentTasks=getTaskByName(dag.vertexSet(), strLine.split("\t")[1].split(","));
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
					addTaskListToDAG(parentTasks, curTask, ef);
					/*add last Task*/
					addTaskListToDAG(lastTasks, curTask, ef);
					/*if (curEdgeSize==dag.edgeSet().size()) {
						dag.addEdge(rootTask, curTask);
						//ef.createEdge(rootTask, curTask);
						System.out.println("Link "+curTask.getName()+" to root node.");
					}*/
					
					System.out.println("Number of nodes: "+dag.vertexSet().size()+" Number of edges: "+dag.edgeSet().size());
                    //ClassBasedEdgeFactory<Task, DefaultEdge> edgeFactory=new ClassBasedEdgeFactory();
                    //System.out.println(pipeline.getTaskNumber());
					
                    getWorkflowUtil().updateLastTaskClass(curTask.getDataFormatIn(), curTask.getDataFormatOut(), curTask);
                    //System.out.println(getWorkflowUtil().getLastTaskClassMap().toString());
                    //System.out.println(defaultListenableGraph.toString());
                    //System.out.println(getWorkflowUtil().getLastTaskClassMap().toString());
            	}
            }
            firstDAGWalker();
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

	}

	public void addTaskListToDAG(EList<Task> lastTasks, Task curTask, EdgeFactory ef) {
		Iterator<Task> it=lastTasks.iterator();
		while (it.hasNext()) {
			Task lastTask=it.next();
			if (dag.containsVertex(lastTask)) {
				System.out.println("Last Task: add edge: "+curTask.getName()+"->"+lastTask.getName());
				Object res=dag.addEdge(lastTask, curTask);
				//Edge e=(Edge) ef.createEdge(lastTask, curTask);
				Edge e=(Edge) dag.getEdge(lastTask, curTask);
				e.setSource(lastTask);
				e.setTarget(curTask);
				//System.out.println("addEdge: "+res);
			}
		}

	}
	
	public void firstDAGWalker() {
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
				System.out.print(edge.getLeafCount()+" "+edge.getLevel()+" "+edge.getAttributes()+" "
						);
				//if (! edge.isRoot()) {
					Task st=(Task) edge.getSource();
					System.out.print(": "+st.getName());
				//}
			}
			System.out.println("	#####");
		}
	}
	
	public EList<Task> getTaskByName(Set<Task> taskSet, String[] taskNames) {
		Iterator<Task> it=taskSet.iterator();
		EList<Task> tasks=new BasicEList<Task>();
		while (it.hasNext()) {
			Task t=it.next();
			for (int i=0;i<taskNames.length;i++)
				if (t.getName().equals(taskNames[i])) tasks.add(t);
		}
		return tasks;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EasyflowPackage.WORKFLOW__NAME:
				return getName();
			case EasyflowPackage.WORKFLOW__DAG:
				return getDag();
			case EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE_FILE_NAME:
				return getWorkflowTemplateFileName();
			case EasyflowPackage.WORKFLOW__METADATA_FILE_NAME:
				return getMetadataFileName();
			case EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE:
				if (resolve) return getWorkflowTemplate();
				return basicGetWorkflowTemplate();
			case EasyflowPackage.WORKFLOW__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
			case EasyflowPackage.WORKFLOW__METADATA:
				if (resolve) return getMetadata();
				return basicGetMetadata();
			case EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE:
				if (resolve) return getImplementationTemplate();
				return basicGetImplementationTemplate();
			case EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE:
				if (resolve) return getDataProcessingType();
				return basicGetDataProcessingType();
			case EasyflowPackage.WORKFLOW__WORKFLOW_UTIL:
				if (resolve) return getWorkflowUtil();
				return basicGetWorkflowUtil();
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
			case EasyflowPackage.WORKFLOW__NAME:
				setName((String)newValue);
				return;
			case EasyflowPackage.WORKFLOW__DAG:
				setDag((ListenableDirectedGraph)newValue);
				return;
			case EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE_FILE_NAME:
				setWorkflowTemplateFileName((String)newValue);
				return;
			case EasyflowPackage.WORKFLOW__METADATA_FILE_NAME:
				setMetadataFileName((String)newValue);
				return;
			case EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE:
				setWorkflowTemplate((EasyFlowTemplate)newValue);
				return;
			case EasyflowPackage.WORKFLOW__CONFIGURATION:
				setConfiguration((EasyFlowConfiguration)newValue);
				return;
			case EasyflowPackage.WORKFLOW__METADATA:
				setMetadata((EasyFlowMetadata)newValue);
				return;
			case EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE:
				setImplementationTemplate((EasyFlowImplementationTemplate)newValue);
				return;
			case EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE:
				setDataProcessingType((DataProcessingType)newValue);
				return;
			case EasyflowPackage.WORKFLOW__WORKFLOW_UTIL:
				setWorkflowUtil((WorkflowUtil)newValue);
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
			case EasyflowPackage.WORKFLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EasyflowPackage.WORKFLOW__DAG:
				setDag(DAG_EDEFAULT);
				return;
			case EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE_FILE_NAME:
				setWorkflowTemplateFileName(WORKFLOW_TEMPLATE_FILE_NAME_EDEFAULT);
				return;
			case EasyflowPackage.WORKFLOW__METADATA_FILE_NAME:
				setMetadataFileName(METADATA_FILE_NAME_EDEFAULT);
				return;
			case EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE:
				setWorkflowTemplate((EasyFlowTemplate)null);
				return;
			case EasyflowPackage.WORKFLOW__CONFIGURATION:
				setConfiguration((EasyFlowConfiguration)null);
				return;
			case EasyflowPackage.WORKFLOW__METADATA:
				setMetadata((EasyFlowMetadata)null);
				return;
			case EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE:
				setImplementationTemplate((EasyFlowImplementationTemplate)null);
				return;
			case EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE:
				setDataProcessingType((DataProcessingType)null);
				return;
			case EasyflowPackage.WORKFLOW__WORKFLOW_UTIL:
				setWorkflowUtil((WorkflowUtil)null);
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
			case EasyflowPackage.WORKFLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EasyflowPackage.WORKFLOW__DAG:
				return DAG_EDEFAULT == null ? dag != null : !DAG_EDEFAULT.equals(dag);
			case EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE_FILE_NAME:
				return WORKFLOW_TEMPLATE_FILE_NAME_EDEFAULT == null ? workflowTemplateFileName != null : !WORKFLOW_TEMPLATE_FILE_NAME_EDEFAULT.equals(workflowTemplateFileName);
			case EasyflowPackage.WORKFLOW__METADATA_FILE_NAME:
				return METADATA_FILE_NAME_EDEFAULT == null ? metadataFileName != null : !METADATA_FILE_NAME_EDEFAULT.equals(metadataFileName);
			case EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE:
				return workflowTemplate != null;
			case EasyflowPackage.WORKFLOW__CONFIGURATION:
				return configuration != null;
			case EasyflowPackage.WORKFLOW__METADATA:
				return metadata != null;
			case EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE:
				return implementationTemplate != null;
			case EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE:
				return dataProcessingType != null;
			case EasyflowPackage.WORKFLOW__WORKFLOW_UTIL:
				return workflowUtil != null;
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
		result.append(", dag: ");
		result.append(dag);
		result.append(", workflowTemplateFileName: ");
		result.append(workflowTemplateFileName);
		result.append(", metadataFileName: ");
		result.append(metadataFileName);
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl
