/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import easyflow.CommandArgument;
import easyflow.EasyflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.impl.CommandArgumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.impl.CommandArgumentImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link easyflow.impl.CommandArgumentImpl#getSep <em>Sep</em>}</li>
 *   <li>{@link easyflow.impl.CommandArgumentImpl#isNamed <em>Named</em>}</li>
 *   <li>{@link easyflow.impl.CommandArgumentImpl#isRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandArgumentImpl extends EObjectImpl implements CommandArgument {
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
	 * The default value of the '{@link #getArg() <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg()
	 * @generated
	 * @ordered
	 */
	protected static final String ARG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArg() <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg()
	 * @generated
	 * @ordered
	 */
	protected String arg = ARG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSep() <em>Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSep()
	 * @generated
	 * @ordered
	 */
	protected static final String SEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSep() <em>Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSep()
	 * @generated
	 * @ordered
	 */
	protected String sep = SEP_EDEFAULT;

	/**
	 * The default value of the '{@link #isNamed() <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNamed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNamed() <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNamed()
	 * @generated
	 * @ordered
	 */
	protected boolean named = NAMED_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EasyflowPackage.Literals.COMMAND_ARGUMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.COMMAND_ARGUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArg() {
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArg(String newArg) {
		String oldArg = arg;
		arg = newArg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.COMMAND_ARGUMENT__ARG, oldArg, arg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSep() {
		return sep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSep(String newSep) {
		String oldSep = sep;
		sep = newSep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.COMMAND_ARGUMENT__SEP, oldSep, sep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNamed() {
		return named;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamed(boolean newNamed) {
		boolean oldNamed = named;
		named = newNamed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.COMMAND_ARGUMENT__NAMED, oldNamed, named));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.COMMAND_ARGUMENT__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EasyflowPackage.COMMAND_ARGUMENT__NAME:
				return getName();
			case EasyflowPackage.COMMAND_ARGUMENT__ARG:
				return getArg();
			case EasyflowPackage.COMMAND_ARGUMENT__SEP:
				return getSep();
			case EasyflowPackage.COMMAND_ARGUMENT__NAMED:
				return isNamed();
			case EasyflowPackage.COMMAND_ARGUMENT__REQUIRED:
				return isRequired();
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
			case EasyflowPackage.COMMAND_ARGUMENT__NAME:
				setName((String)newValue);
				return;
			case EasyflowPackage.COMMAND_ARGUMENT__ARG:
				setArg((String)newValue);
				return;
			case EasyflowPackage.COMMAND_ARGUMENT__SEP:
				setSep((String)newValue);
				return;
			case EasyflowPackage.COMMAND_ARGUMENT__NAMED:
				setNamed((Boolean)newValue);
				return;
			case EasyflowPackage.COMMAND_ARGUMENT__REQUIRED:
				setRequired((Boolean)newValue);
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
			case EasyflowPackage.COMMAND_ARGUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EasyflowPackage.COMMAND_ARGUMENT__ARG:
				setArg(ARG_EDEFAULT);
				return;
			case EasyflowPackage.COMMAND_ARGUMENT__SEP:
				setSep(SEP_EDEFAULT);
				return;
			case EasyflowPackage.COMMAND_ARGUMENT__NAMED:
				setNamed(NAMED_EDEFAULT);
				return;
			case EasyflowPackage.COMMAND_ARGUMENT__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
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
			case EasyflowPackage.COMMAND_ARGUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EasyflowPackage.COMMAND_ARGUMENT__ARG:
				return ARG_EDEFAULT == null ? arg != null : !ARG_EDEFAULT.equals(arg);
			case EasyflowPackage.COMMAND_ARGUMENT__SEP:
				return SEP_EDEFAULT == null ? sep != null : !SEP_EDEFAULT.equals(sep);
			case EasyflowPackage.COMMAND_ARGUMENT__NAMED:
				return named != NAMED_EDEFAULT;
			case EasyflowPackage.COMMAND_ARGUMENT__REQUIRED:
				return required != REQUIRED_EDEFAULT;
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
		result.append(", arg: ");
		result.append(arg);
		result.append(", sep: ");
		result.append(sep);
		result.append(", named: ");
		result.append(named);
		result.append(", required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //CommandArgumentImpl
