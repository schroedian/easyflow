/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import easyflow.CommandArgument;
import easyflow.CommandLine;
import easyflow.EasyflowPackage;
import easyflow.Option;
import easyflow.Tool;

import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.impl.CommandLineImpl#getSubCmd <em>Sub Cmd</em>}</li>
 *   <li>{@link easyflow.impl.CommandLineImpl#getArgIn <em>Arg In</em>}</li>
 *   <li>{@link easyflow.impl.CommandLineImpl#getArgOut <em>Arg Out</em>}</li>
 *   <li>{@link easyflow.impl.CommandLineImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link easyflow.impl.CommandLineImpl#getOptionalArg <em>Optional Arg</em>}</li>
 *   <li>{@link easyflow.impl.CommandLineImpl#getRequiredArg <em>Required Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandLineImpl extends EObjectImpl implements CommandLine {
	/**
	 * The default value of the '{@link #getSubCmd() <em>Sub Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCmd()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_CMD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubCmd() <em>Sub Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCmd()
	 * @generated
	 * @ordered
	 */
	protected String subCmd = SUB_CMD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgIn() <em>Arg In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgIn()
	 * @generated
	 * @ordered
	 */
	protected EList<CommandArgument> argIn;

	/**
	 * The cached value of the '{@link #getArgOut() <em>Arg Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgOut()
	 * @generated
	 * @ordered
	 */
	protected EList<CommandArgument> argOut;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected Tool tool;

	/**
	 * The cached value of the '{@link #getOptionalArg() <em>Optional Arg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalArg()
	 * @generated
	 * @ordered
	 */
	protected EList<CommandArgument> optionalArg;

	/**
	 * The cached value of the '{@link #getRequiredArg() <em>Required Arg</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredArg()
	 * @generated
	 * @ordered
	 */
	protected EList<CommandArgument> requiredArg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EasyflowPackage.Literals.COMMAND_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubCmd() {
		return subCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubCmd(String newSubCmd) {
		String oldSubCmd = subCmd;
		subCmd = newSubCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.COMMAND_LINE__SUB_CMD, oldSubCmd, subCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommandArgument> getArgIn() {
		if (argIn == null) {
			argIn = new EObjectContainmentEList<CommandArgument>(CommandArgument.class, this, EasyflowPackage.COMMAND_LINE__ARG_IN);
		}
		return argIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommandArgument> getArgOut() {
		if (argOut == null) {
			argOut = new EObjectContainmentEList<CommandArgument>(CommandArgument.class, this, EasyflowPackage.COMMAND_LINE__ARG_OUT);
		}
		return argOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTool(Tool newTool, NotificationChain msgs) {
		Tool oldTool = tool;
		tool = newTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EasyflowPackage.COMMAND_LINE__TOOL, oldTool, newTool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(Tool newTool) {
		if (newTool != tool) {
			NotificationChain msgs = null;
			if (tool != null)
				msgs = ((InternalEObject)tool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.COMMAND_LINE__TOOL, null, msgs);
			if (newTool != null)
				msgs = ((InternalEObject)newTool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EasyflowPackage.COMMAND_LINE__TOOL, null, msgs);
			msgs = basicSetTool(newTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.COMMAND_LINE__TOOL, newTool, newTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommandArgument> getOptionalArg() {
		if (optionalArg == null) {
			optionalArg = new EObjectContainmentEList<CommandArgument>(CommandArgument.class, this, EasyflowPackage.COMMAND_LINE__OPTIONAL_ARG);
		}
		return optionalArg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommandArgument> getRequiredArg() {
		if (requiredArg == null) {
			requiredArg = new EObjectResolvingEList<CommandArgument>(CommandArgument.class, this, EasyflowPackage.COMMAND_LINE__REQUIRED_ARG);
		}
		return requiredArg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> printCommandLine() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setCmdProperties(Map<String, String> parameterConfigMap) {
		//get
		if (parameterConfigMap.containsKey("sep"))
			parameterConfigMap.get("sep");
		//else 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EasyflowPackage.COMMAND_LINE__ARG_IN:
				return ((InternalEList<?>)getArgIn()).basicRemove(otherEnd, msgs);
			case EasyflowPackage.COMMAND_LINE__ARG_OUT:
				return ((InternalEList<?>)getArgOut()).basicRemove(otherEnd, msgs);
			case EasyflowPackage.COMMAND_LINE__TOOL:
				return basicSetTool(null, msgs);
			case EasyflowPackage.COMMAND_LINE__OPTIONAL_ARG:
				return ((InternalEList<?>)getOptionalArg()).basicRemove(otherEnd, msgs);
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
			case EasyflowPackage.COMMAND_LINE__SUB_CMD:
				return getSubCmd();
			case EasyflowPackage.COMMAND_LINE__ARG_IN:
				return getArgIn();
			case EasyflowPackage.COMMAND_LINE__ARG_OUT:
				return getArgOut();
			case EasyflowPackage.COMMAND_LINE__TOOL:
				return getTool();
			case EasyflowPackage.COMMAND_LINE__OPTIONAL_ARG:
				return getOptionalArg();
			case EasyflowPackage.COMMAND_LINE__REQUIRED_ARG:
				return getRequiredArg();
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
			case EasyflowPackage.COMMAND_LINE__SUB_CMD:
				setSubCmd((String)newValue);
				return;
			case EasyflowPackage.COMMAND_LINE__ARG_IN:
				getArgIn().clear();
				getArgIn().addAll((Collection<? extends CommandArgument>)newValue);
				return;
			case EasyflowPackage.COMMAND_LINE__ARG_OUT:
				getArgOut().clear();
				getArgOut().addAll((Collection<? extends CommandArgument>)newValue);
				return;
			case EasyflowPackage.COMMAND_LINE__TOOL:
				setTool((Tool)newValue);
				return;
			case EasyflowPackage.COMMAND_LINE__OPTIONAL_ARG:
				getOptionalArg().clear();
				getOptionalArg().addAll((Collection<? extends CommandArgument>)newValue);
				return;
			case EasyflowPackage.COMMAND_LINE__REQUIRED_ARG:
				getRequiredArg().clear();
				getRequiredArg().addAll((Collection<? extends CommandArgument>)newValue);
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
			case EasyflowPackage.COMMAND_LINE__SUB_CMD:
				setSubCmd(SUB_CMD_EDEFAULT);
				return;
			case EasyflowPackage.COMMAND_LINE__ARG_IN:
				getArgIn().clear();
				return;
			case EasyflowPackage.COMMAND_LINE__ARG_OUT:
				getArgOut().clear();
				return;
			case EasyflowPackage.COMMAND_LINE__TOOL:
				setTool((Tool)null);
				return;
			case EasyflowPackage.COMMAND_LINE__OPTIONAL_ARG:
				getOptionalArg().clear();
				return;
			case EasyflowPackage.COMMAND_LINE__REQUIRED_ARG:
				getRequiredArg().clear();
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
			case EasyflowPackage.COMMAND_LINE__SUB_CMD:
				return SUB_CMD_EDEFAULT == null ? subCmd != null : !SUB_CMD_EDEFAULT.equals(subCmd);
			case EasyflowPackage.COMMAND_LINE__ARG_IN:
				return argIn != null && !argIn.isEmpty();
			case EasyflowPackage.COMMAND_LINE__ARG_OUT:
				return argOut != null && !argOut.isEmpty();
			case EasyflowPackage.COMMAND_LINE__TOOL:
				return tool != null;
			case EasyflowPackage.COMMAND_LINE__OPTIONAL_ARG:
				return optionalArg != null && !optionalArg.isEmpty();
			case EasyflowPackage.COMMAND_LINE__REQUIRED_ARG:
				return requiredArg != null && !requiredArg.isEmpty();
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
		result.append(" (subCmd: ");
		result.append(subCmd);
		result.append(')');
		return result.toString();
	}

} //CommandLineImpl
