/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.hdl.hDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Signal Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.hdl.hDL.PTSignalDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.hdl.hDL.PTSignalDecl#getSignalType <em>Signal Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.hdl.hDL.HDLPackage#getPTSignalDecl()
 * @model
 * @generated
 */
public interface PTSignalDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.hdl.hDL.HDLPackage#getPTSignalDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.hdl.hDL.PTSignalDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Signal Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal Type</em>' attribute.
   * @see #setSignalType(String)
   * @see org.xtext.example.hdl.hDL.HDLPackage#getPTSignalDecl_SignalType()
   * @model
   * @generated
   */
  String getSignalType();

  /**
   * Sets the value of the '{@link org.xtext.example.hdl.hDL.PTSignalDecl#getSignalType <em>Signal Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal Type</em>' attribute.
   * @see #getSignalType()
   * @generated
   */
  void setSignalType(String value);

} // PTSignalDecl
