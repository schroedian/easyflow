/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import easyflow.CommandLine;
import easyflow.DataFormat;
import easyflow.EasyFlowImplementationTemplate;
import easyflow.EasyflowPackage;
import easyflow.Task;
import easyflow.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.jgraph.graph.DefaultEdge;
import org.jgrapht.graph.ListenableDirectedGraph;
import org.jgrapht.traverse.BreadthFirstIterator;

import argo.jdom.JdomParser;
import argo.jdom.JsonNode;
import argo.jdom.JsonRootNode;
import argo.jdom.JsonStringNode;
import argo.saj.InvalidSyntaxException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Easy Flow Implementation Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.impl.EasyFlowImplementationTemplateImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link easyflow.impl.EasyFlowImplementationTemplateImpl#getParameterFileName <em>Parameter File Name</em>}</li>
 *   <li>{@link easyflow.impl.EasyFlowImplementationTemplateImpl#getParameterConfigMap <em>Parameter Config Map</em>}</li>
 *   <li>{@link easyflow.impl.EasyFlowImplementationTemplateImpl#getJsonRootNode <em>Json Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EasyFlowImplementationTemplateImpl extends EObjectImpl implements EasyFlowImplementationTemplate {
	
	private static final JdomParser JDOM_PARSER = new JdomParser();
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
	 * The default value of the '{@link #getParameterFileName() <em>Parameter File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterFileName() <em>Parameter File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterFileName()
	 * @generated
	 * @ordered
	 */
	protected String parameterFileName = PARAMETER_FILE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterConfigMap() <em>Parameter Config Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterConfigMap()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> parameterConfigMap;

	/**
	 * The default value of the '{@link #getJsonRootNode() <em>Json Root Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonRootNode()
	 * @generated
	 * @ordered
	 */
	protected static final JsonRootNode JSON_ROOT_NODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJsonRootNode() <em>Json Root Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonRootNode()
	 * @generated
	 * @ordered
	 */
	protected JsonRootNode jsonRootNode = JSON_ROOT_NODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EasyFlowImplementationTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EasyflowPackage.Literals.EASY_FLOW_IMPLEMENTATION_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterFileName() {
		return parameterFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterFileName(String newParameterFileName) {
		String oldParameterFileName = parameterFileName;
		parameterFileName = newParameterFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_FILE_NAME, oldParameterFileName, parameterFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getParameterConfigMap() {
		return parameterConfigMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterConfigMap(Map<String, String> newParameterConfigMap) {
		Map<String, String> oldParameterConfigMap = parameterConfigMap;
		parameterConfigMap = newParameterConfigMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_CONFIG_MAP, oldParameterConfigMap, parameterConfigMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonRootNode getJsonRootNode() {
		return jsonRootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonRootNode(JsonRootNode newJsonRootNode) {
		JsonRootNode oldJsonRootNode = jsonRootNode;
		jsonRootNode = newJsonRootNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__JSON_ROOT_NODE, oldJsonRootNode, jsonRootNode));
	}
	
	public void getTasksByName(ListenableDirectedGraph dag, String toolName) {
		BreadthFirstIterator breadthFirstIt=new BreadthFirstIterator(dag);
		EasyflowFactoryImpl ef=new EasyflowFactoryImpl();
		ArrayList tasks=new ArrayList<Task>();
		
		while (breadthFirstIt.hasNext()){
			Task t=(Task) breadthFirstIt.next();
			if (t.getName().equals(toolName))
				tasks.add(t);
			/*
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
			}*/
		}

	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void templateFileParser(ListenableDirectedGraph dag) {
		BreadthFirstIterator breadthFirstIt=new BreadthFirstIterator(dag);
		EasyflowFactoryImpl ef=new EasyflowFactoryImpl();
		while (breadthFirstIt.hasNext()){
			Task t=(Task) breadthFirstIt.next();
			System.out.println("read impl: "+t.getName()+" "+t.getParentTasks().size());
			if (dag.incomingEdgesOf(t).size()>0) {
			readParameterConfig(t.getName());
			System.out.println("read impl: "+t.getName()+" "+getParameterConfigMap());
			CommandLine cmdLine=ef.createCommandLine();
			cmdLine.setCmdProperties(getParameterConfigMap());
			Set<DefaultEdge> edgeSet=dag.incomingEdgesOf(t);
			Iterator<DefaultEdge> it=edgeSet.iterator();
			while (it.hasNext()) {
				DefaultEdge edge=it.next();
				System.out.print(edge.getLeafCount()+" "+edge.getLevel()+" "+edge.getAttributes()+" ");
				//if (! edge.isRoot()) {
					Task st=(Task) edge.getSource();
					System.out.print(": "+st.getName());
				//}
			}
			System.out.println("	#####");
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void readParameterConfig(String toolName) {
    	Map<String, String> newConfigMap=new HashMap<String,String>();
    	setParameterConfigMap(newConfigMap);
    	getParameterConfigMap().put("sep", 
    			getJsonRootNode().getStringValue(toolName, "sep"));
    	getParameterConfigMap().put("is_named", 
    			getJsonRootNode().getStringValue(toolName, "is_named"));
    	for (int i=0; i<DataFormat.values().length;i++) {
    		//if (getJsonRootNode().has)
    		try {
    		getParameterConfigMap().put(DataFormat.values()[i].toString(), 
    			getJsonRootNode().getStringValue(toolName, DataFormat.values()[i].toString()));
    		} catch (Exception ex) {
    			System.out.println("No Key for "+toolName+" "+DataFormat.values()[i].toString());
    		}
    	}
    	
    	//getParameterConfigMap().put(key, value)

    	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void initJsonRootNode() {
		File file = new File(this.getParameterFileName());
		InputStream is=null;
		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String jsonTxt=null;
		try {
			jsonTxt = IOUtils.toString( is );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(jsonTxt);
	    Map<JsonStringNode, JsonNode> fields;
	    JsonRootNode json=null;
	    try {
			json = JDOM_PARSER.parse(jsonTxt);
		} catch (InvalidSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__FILE_NAME:
				return getFileName();
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_FILE_NAME:
				return getParameterFileName();
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_CONFIG_MAP:
				return getParameterConfigMap();
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__JSON_ROOT_NODE:
				return getJsonRootNode();
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
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_FILE_NAME:
				setParameterFileName((String)newValue);
				return;
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_CONFIG_MAP:
				setParameterConfigMap((Map<String, String>)newValue);
				return;
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__JSON_ROOT_NODE:
				setJsonRootNode((JsonRootNode)newValue);
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
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_FILE_NAME:
				setParameterFileName(PARAMETER_FILE_NAME_EDEFAULT);
				return;
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_CONFIG_MAP:
				setParameterConfigMap((Map<String, String>)null);
				return;
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__JSON_ROOT_NODE:
				setJsonRootNode(JSON_ROOT_NODE_EDEFAULT);
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
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_FILE_NAME:
				return PARAMETER_FILE_NAME_EDEFAULT == null ? parameterFileName != null : !PARAMETER_FILE_NAME_EDEFAULT.equals(parameterFileName);
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__PARAMETER_CONFIG_MAP:
				return parameterConfigMap != null;
			case EasyflowPackage.EASY_FLOW_IMPLEMENTATION_TEMPLATE__JSON_ROOT_NODE:
				return JSON_ROOT_NODE_EDEFAULT == null ? jsonRootNode != null : !JSON_ROOT_NODE_EDEFAULT.equals(jsonRootNode);
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
		result.append(", parameterFileName: ");
		result.append(parameterFileName);
		result.append(", parameterConfigMap: ");
		result.append(parameterConfigMap);
		result.append(", jsonRootNode: ");
		result.append(jsonRootNode);
		result.append(')');
		return result.toString();
	}

} //EasyFlowImplementationTemplateImpl
