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

import org.eclipse.emf.common.notify.Notification;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Processing Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.impl.DataProcessingTypeImpl#getDataFormatIn <em>Data Format In</em>}</li>
 *   <li>{@link easyflow.impl.DataProcessingTypeImpl#getDataFormatOut <em>Data Format Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataProcessingTypeImpl extends EObjectImpl implements DataProcessingType {
	/**
	 * The default value of the '{@link #getDataFormatIn() <em>Data Format In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormatIn()
	 * @generated
	 * @ordered
	 */
	protected static final DataFormat DATA_FORMAT_IN_EDEFAULT = DataFormat.NONE;

	/**
	 * The cached value of the '{@link #getDataFormatIn() <em>Data Format In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormatIn()
	 * @generated
	 * @ordered
	 */
	protected DataFormat dataFormatIn = DATA_FORMAT_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataFormatOut() <em>Data Format Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormatOut()
	 * @generated
	 * @ordered
	 */
	protected static final DataFormat DATA_FORMAT_OUT_EDEFAULT = DataFormat.NONE;

	/**
	 * The cached value of the '{@link #getDataFormatOut() <em>Data Format Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormatOut()
	 * @generated
	 * @ordered
	 */
	protected DataFormat dataFormatOut = DATA_FORMAT_OUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataProcessingTypeImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EasyflowPackage.Literals.DATA_PROCESSING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormat getDataFormatIn() {
		return dataFormatIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFormatIn(DataFormat newDataFormatIn) {
		DataFormat oldDataFormatIn = dataFormatIn;
		dataFormatIn = newDataFormatIn == null ? DATA_FORMAT_IN_EDEFAULT : newDataFormatIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.DATA_PROCESSING_TYPE__DATA_FORMAT_IN, oldDataFormatIn, dataFormatIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormat getDataFormatOut() {
		return dataFormatOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFormatOut(DataFormat newDataFormatOut) {
		DataFormat oldDataFormatOut = dataFormatOut;
		dataFormatOut = newDataFormatOut == null ? DATA_FORMAT_OUT_EDEFAULT : newDataFormatOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EasyflowPackage.DATA_PROCESSING_TYPE__DATA_FORMAT_OUT, oldDataFormatOut, dataFormatOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EasyflowPackage.DATA_PROCESSING_TYPE__DATA_FORMAT_IN:
				return getDataFormatIn();
			case EasyflowPackage.DATA_PROCESSING_TYPE__DATA_FORMAT_OUT:
				return getDataFormatOut();
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
			case EasyflowPackage.DATA_PROCESSING_TYPE__DATA_FORMAT_IN:
				setDataFormatIn((DataFormat)newValue);
				return;
			case EasyflowPackage.DATA_PROCESSING_TYPE__DATA_FORMAT_OUT:
				setDataFormatOut((DataFormat)newValue);
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
			case EasyflowPackage.DATA_PROCESSING_TYPE__DATA_FORMAT_IN:
				setDataFormatIn(DATA_FORMAT_IN_EDEFAULT);
				return;
			case EasyflowPackage.DATA_PROCESSING_TYPE__DATA_FORMAT_OUT:
				setDataFormatOut(DATA_FORMAT_OUT_EDEFAULT);
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
			case EasyflowPackage.DATA_PROCESSING_TYPE__DATA_FORMAT_IN:
				return dataFormatIn != DATA_FORMAT_IN_EDEFAULT;
			case EasyflowPackage.DATA_PROCESSING_TYPE__DATA_FORMAT_OUT:
				return dataFormatOut != DATA_FORMAT_OUT_EDEFAULT;
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
		result.append(" (dataFormatIn: ");
		result.append(dataFormatIn);
		result.append(", dataFormatOut: ");
		result.append(dataFormatOut);
		result.append(')');
		return result.toString();
	}
	
	public boolean isConvertableTo(DataProcessingType dPT) {
		return dPT.getDataFormatIn().equals(getDataFormatOut());
	}
	
	public boolean equals(Object dataProcessingType) {
		DataProcessingType dPT=(DataProcessingType) dataProcessingType;
			return (dPT.getDataFormatIn().equals(getDataFormatIn()) &&
				dPT.getDataFormatOut().equals(getDataFormatOut()));
			
	}
	private volatile int hashCode = 0;
	

	public int hashCode() {
		final int multiplier = 23;
        if (hashCode == 0) {
            int code = 133;
            if (dataFormatIn!=null)
            code = multiplier * code + dataFormatIn.getName().getBytes().hashCode();
            if (dataFormatOut!=null)
            	code = multiplier * code + dataFormatOut.getName().getBytes().hashCode();
            hashCode = code;
        }
        return hashCode;
	}
} //DataProcessingTypeImpl
