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
import easyflow.EasyflowPackage;
import easyflow.IWorkflowUtil;
import easyflow.Task;
import easyflow.Workflow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.jgrapht.graph.ListenableDirectedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.impl.WorkflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getDag <em>Dag</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getWorkflowTemplate <em>Workflow Template</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getImplementationTemplate <em>Implementation Template</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getDataProcessingType <em>Data Processing Type</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getWorkflowUtil <em>Workflow Util</em>}</li>
 *   <li>{@link easyflow.impl.WorkflowImpl#getLastTaskClassMap <em>Last Task Class Map</em>}</li>
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
	 * The cached value of the '{@link #getWorkflowTemplate() <em>Workflow Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowTemplate()
	 * @generated
	 * @ordered
	 */
	protected EasyFlowTemplate workflowTemplate;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EasyFlowConfiguration configuration;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EasyFlowMetadata metadata;

	/**
	 * The cached value of the '{@link #getImplementationTemplate() <em>Implementation Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationTemplate()
	 * @generated
	 * @ordered
	 */
	protected EasyFlowImplementationTemplate implementationTemplate;

	/**
	 * The cached value of the '{@link #getDataProcessingType() <em>Data Processing Type</em>}' containment reference.
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
	protected IWorkflowUtil workflowUtil;

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
	protected WorkflowImpl() {
		super();
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
	public EasyFlowTemplate getWorkflowTemplate() {
		return workflowTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflowTemplate(EasyFlowTemplate newWorkflowTemplate, NotificationChain msgs) {
		EasyFlowTemplate oldWorkflowTemplate = workflowTemplate;
		workflowTemplate = newWorkflowTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE, oldWorkflowTemplate, newWorkflowTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflowTemplate(EasyFlowTemplate newWorkflowTemplate) {
		if (newWorkflowTemplate != workflowTemplate) {
			NotificationChain msgs = null;
			if (workflowTemplate != null)
				msgs = ((InternalEObject)workflowTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE, null, msgs);
			if (newWorkflowTemplate != null)
				msgs = ((InternalEObject)newWorkflowTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE, null, msgs);
			msgs = basicSetWorkflowTemplate(newWorkflowTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE, newWorkflowTemplate, newWorkflowTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(EasyFlowConfiguration newConfiguration, NotificationChain msgs) {
		EasyFlowConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(EasyFlowConfiguration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.WORKFLOW__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.WORKFLOW__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowMetadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(EasyFlowMetadata newMetadata, NotificationChain msgs) {
		EasyFlowMetadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(EasyFlowMetadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.WORKFLOW__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.WORKFLOW__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowImplementationTemplate getImplementationTemplate() {
		return implementationTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationTemplate(EasyFlowImplementationTemplate newImplementationTemplate, NotificationChain msgs) {
		EasyFlowImplementationTemplate oldImplementationTemplate = implementationTemplate;
		implementationTemplate = newImplementationTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE, oldImplementationTemplate, newImplementationTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationTemplate(EasyFlowImplementationTemplate newImplementationTemplate) {
		if (newImplementationTemplate != implementationTemplate) {
			NotificationChain msgs = null;
			if (implementationTemplate != null)
				msgs = ((InternalEObject)implementationTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE, null, msgs);
			if (newImplementationTemplate != null)
				msgs = ((InternalEObject)newImplementationTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE, null, msgs);
			msgs = basicSetImplementationTemplate(newImplementationTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE, newImplementationTemplate, newImplementationTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessingType getDataProcessingType() {
		return dataProcessingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataProcessingType(DataProcessingType newDataProcessingType, NotificationChain msgs) {
		DataProcessingType oldDataProcessingType = dataProcessingType;
		dataProcessingType = newDataProcessingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE, oldDataProcessingType, newDataProcessingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProcessingType(DataProcessingType newDataProcessingType) {
		if (newDataProcessingType != dataProcessingType) {
			NotificationChain msgs = null;
			if (dataProcessingType != null)
				msgs = ((InternalEObject)dataProcessingType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE, null, msgs);
			if (newDataProcessingType != null)
				msgs = ((InternalEObject)newDataProcessingType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE, null, msgs);
			msgs = basicSetDataProcessingType(newDataProcessingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE, newDataProcessingType, newDataProcessingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IWorkflowUtil getWorkflowUtil() {
		if (workflowUtil != null && workflowUtil.eIsProxy()) {
			InternalEObject oldWorkflowUtil = (InternalEObject)workflowUtil;
			workflowUtil = (IWorkflowUtil)eResolveProxy(oldWorkflowUtil);
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
	public IWorkflowUtil basicGetWorkflowUtil() {
		return workflowUtil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflowUtil(IWorkflowUtil newWorkflowUtil) {
		IWorkflowUtil oldWorkflowUtil = workflowUtil;
		workflowUtil = newWorkflowUtil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.WORKFLOW__WORKFLOW_UTIL, oldWorkflowUtil, workflowUtil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<DataProcessingType, Task> getLastTaskClassMap() {
		if (lastTaskClassMap == null) {
			lastTaskClassMap = new EcoreEMap<DataProcessingType,Task>(EasyflowPackage.Literals.DATA_PROCESSING_TYPE_TO_TASK, DataProcessingTypeToTaskImpl.class, this, EasyflowPackage.WORKFLOW__LAST_TASK_CLASS_MAP);
		}
		return lastTaskClassMap;
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
	 * @generated
	 */
	public void readWorkflowTemplate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE:
				return basicSetWorkflowTemplate(null, msgs);
			case EasyflowPackage.WORKFLOW__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case EasyflowPackage.WORKFLOW__METADATA:
				return basicSetMetadata(null, msgs);
			case EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE:
				return basicSetImplementationTemplate(null, msgs);
			case EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE:
				return basicSetDataProcessingType(null, msgs);
			case EasyflowPackage.WORKFLOW__LAST_TASK_CLASS_MAP:
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
			case EasyflowPackage.WORKFLOW__NAME:
				return getName();
			case EasyflowPackage.WORKFLOW__DAG:
				return getDag();
			case EasyflowPackage.WORKFLOW__WORKFLOW_TEMPLATE:
				return getWorkflowTemplate();
			case EasyflowPackage.WORKFLOW__CONFIGURATION:
				return getConfiguration();
			case EasyflowPackage.WORKFLOW__METADATA:
				return getMetadata();
			case EasyflowPackage.WORKFLOW__IMPLEMENTATION_TEMPLATE:
				return getImplementationTemplate();
			case EasyflowPackage.WORKFLOW__DATA_PROCESSING_TYPE:
				return getDataProcessingType();
			case EasyflowPackage.WORKFLOW__WORKFLOW_UTIL:
				if (resolve) return getWorkflowUtil();
				return basicGetWorkflowUtil();
			case EasyflowPackage.WORKFLOW__LAST_TASK_CLASS_MAP:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EasyflowPackage.WORKFLOW__NAME:
				setName((String)newValue);
				return;
			case EasyflowPackage.WORKFLOW__DAG:
				setDag((ListenableDirectedGraph)newValue);
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
				setWorkflowUtil((IWorkflowUtil)newValue);
				return;
			case EasyflowPackage.WORKFLOW__LAST_TASK_CLASS_MAP:
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
			case EasyflowPackage.WORKFLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EasyflowPackage.WORKFLOW__DAG:
				setDag(DAG_EDEFAULT);
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
				setWorkflowUtil((IWorkflowUtil)null);
				return;
			case EasyflowPackage.WORKFLOW__LAST_TASK_CLASS_MAP:
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
			case EasyflowPackage.WORKFLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EasyflowPackage.WORKFLOW__DAG:
				return DAG_EDEFAULT == null ? dag != null : !DAG_EDEFAULT.equals(dag);
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
			case EasyflowPackage.WORKFLOW__LAST_TASK_CLASS_MAP:
				return lastTaskClassMap != null && !lastTaskClassMap.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl
