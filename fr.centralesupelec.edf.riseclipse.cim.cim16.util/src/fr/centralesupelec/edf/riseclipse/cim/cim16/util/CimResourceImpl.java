/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim16.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLSave;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class CimResourceImpl extends fr.centralesupelec.edf.riseclipse.cim.util.cimxml.CimResourceImpl {

    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param uri the URI of the new resource.
     * @generated NOT
     */
    public CimResourceImpl( URI uri ) {
        super( uri );
    }

    @Override
    protected XMLSave createXMLSave() {
        return new CimXMLSaveImpl( createXMLHelper() );
    }

    @Override
    protected XMLHelper createXMLHelper() {
        return new CimXMLHelperImpl( this );
    }

} // CimResourceImpl
