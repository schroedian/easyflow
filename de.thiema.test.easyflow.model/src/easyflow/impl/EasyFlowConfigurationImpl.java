/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import easyflow.EasyFlowConfiguration;
import easyflow.EasyflowPackage;
import easyflow.Util;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import argo.jdom.JdomParser;
import argo.jdom.JsonNode;
import argo.jdom.JsonRootNode;
import argo.jdom.JsonStringNode;
import argo.saj.InvalidSyntaxException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Easy Flow Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.impl.EasyFlowConfigurationImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link easyflow.impl.EasyFlowConfigurationImpl#getConfigMap <em>Config Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EasyFlowConfigurationImpl extends EObjectImpl implements EasyFlowConfiguration {
	
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
	 * The cached value of the '{@link #getConfigMap() <em>Config Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigMap()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> configMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EasyFlowConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EasyflowPackage.Literals.EASY_FLOW_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.EASY_FLOW_CONFIGURATION__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getConfigMap() {
		return configMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigMap(Map<String, String> newConfigMap) {
		Map<String, String> oldConfigMap = configMap;
		configMap = newConfigMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.EASY_FLOW_CONFIGURATION__CONFIG_MAP, oldConfigMap, configMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException 
	 */
	public void configFileReader() throws IOException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println(this.getFileName());
		File file = new File(this.getFileName());
		InputStream is = new FileInputStream(file);
		//InputStream is=Thread.currentThread().getContextClassLoader().getResourceAsStream(this.getFileName());
		System.out.println(is);
		//System.out.println(java.lang.Object.class.getResource("./").getPath());
	    //InputStream is = java.lang.Object.class.getClassLoader().getResourceAsStream(
	    //		java.lang.Object.class.getResource(this.getFileName()).getPath());
	    //InputStream is = new InputStream();
	    String jsonTxt = IOUtils.toString( is );
	    System.out.println(jsonTxt);
	    Map<JsonStringNode, JsonNode> fields;

	    try {
	    	JsonRootNode json = JDOM_PARSER.parse(jsonTxt);
	    	System.out.println(json.getStringValue("project", "baseDir"));
	    	String baseDir=json.getStringValue("project", "baseDir");
	    	System.out.println(json.getStringValue("project", "implementationTemplateFile"));
	    	System.out.println(json.getStringValue("project", "workflowTemplateFile"));
	    	System.out.println(Util.joinPath(baseDir,json.getStringValue("project", "implementationTemplateFile")));
	    	Map<String, String> newConfigMap=new HashMap<String,String>();
	    	setConfigMap(newConfigMap);
	    	getConfigMap().put("implementationTemplateFile", Util.joinPath(baseDir,json.getStringValue("project", "implementationTemplateFile")));
	    	getConfigMap().put("implementationConfigFile", Util.joinPath(baseDir, json.getStringValue("project", "implementationConfigFile")));
	    	getConfigMap().put("workflowTemplateFile", Util.joinPath(baseDir, json.getStringValue("project", "workflowTemplateFile")));
	    	getConfigMap().put("metadataFile", Util.joinPath(baseDir, json.getStringValue("project", "metadataFile")));
	    	
/*
	    	fields=JDOM_PARSER.parse(jsonTxt).getFields();
			Iterator<JsonStringNode> it=fields.keySet().iterator();
			while (it.hasNext()) {
				JsonStringNode sn=it.next();
				//System.out.println(sn.getText()+" "+fields.get(sn));
				if (sn.getText().equals(new String("project"))) {
					//System.out.println(sn.getStringValue("baseDir"));
					
					System.out.println(fields.get(sn).getFields().keySet());
					System.out.println(fields.get(sn).getStringValue("project", "baseDir"));
				}
			}
			
		    //String secondSingle = getStringValue("", 1);
*/
		} catch (InvalidSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    /*	    
		System.out.println( "Pr");
		JSONObject json = (JSONObject) JSONSerializer.toJSON( jsonTxt );
		System.out.println( "Pr");
		JSONObject project = json.getJSONObject("project");
		String baseDir = project.getString("baseDir");
		System.out.println( "Pr");
		String workflowTpl = project.getString("workflowTemplateFile");
    	String implTpl = project.getString("implementationTemplateFile");	    	
    	System.out.println( "Project: " + baseDir +" "+workflowTpl+" "+implTpl );


	    
	    	
	    	
	    	*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EasyflowPackage.EASY_FLOW_CONFIGURATION__FILE_NAME:
				return getFileName();
			case EasyflowPackage.EASY_FLOW_CONFIGURATION__CONFIG_MAP:
				return getConfigMap();
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
			case EasyflowPackage.EASY_FLOW_CONFIGURATION__FILE_NAME:
				setFileName((String)newValue);
				return;
			case EasyflowPackage.EASY_FLOW_CONFIGURATION__CONFIG_MAP:
				setConfigMap((Map<String, String>)newValue);
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
			case EasyflowPackage.EASY_FLOW_CONFIGURATION__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case EasyflowPackage.EASY_FLOW_CONFIGURATION__CONFIG_MAP:
				setConfigMap((Map<String, String>)null);
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
			case EasyflowPackage.EASY_FLOW_CONFIGURATION__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case EasyflowPackage.EASY_FLOW_CONFIGURATION__CONFIG_MAP:
				return configMap != null;
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
		result.append(", configMap: ");
		result.append(configMap);
		result.append(')');
		return result.toString();
	}

} //EasyFlowConfigurationImpl
