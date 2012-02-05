/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import easyflow.Argument;
import easyflow.EasyflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.impl.ArgumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.impl.ArgumentImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link easyflow.impl.ArgumentImpl#getSep <em>Sep</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends EObjectImpl implements Argument {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EasyflowPackage.Literals.ARGUMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.ARGUMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.ARGUMENT__ARG, oldArg, arg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.ARGUMENT__SEP, oldSep, sep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EasyflowPackage.ARGUMENT__NAME:
				return getName();
			case EasyflowPackage.ARGUMENT__ARG:
				return getArg();
			case EasyflowPackage.ARGUMENT__SEP:
				return getSep();
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
			case EasyflowPackage.ARGUMENT__NAME:
				setName((String)newValue);
				return;
			case EasyflowPackage.ARGUMENT__ARG:
				setArg((String)newValue);
				return;
			case EasyflowPackage.ARGUMENT__SEP:
				setSep((String)newValue);
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
			case EasyflowPackage.ARGUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EasyflowPackage.ARGUMENT__ARG:
				setArg(ARG_EDEFAULT);
				return;
			case EasyflowPackage.ARGUMENT__SEP:
				setSep(SEP_EDEFAULT);
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
			case EasyflowPackage.ARGUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EasyflowPackage.ARGUMENT__ARG:
				return ARG_EDEFAULT == null ? arg != null : !ARG_EDEFAULT.equals(arg);
			case EasyflowPackage.ARGUMENT__SEP:
				return SEP_EDEFAULT == null ? sep != null : !SEP_EDEFAULT.equals(sep);
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
		result.append(')');
		return result.toString();
	}

} //ArgumentImpl
