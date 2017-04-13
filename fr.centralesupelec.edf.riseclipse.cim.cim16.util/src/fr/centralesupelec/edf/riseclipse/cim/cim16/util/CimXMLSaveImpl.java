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

import java.util.Map;

import org.eclipse.emf.ecore.xmi.XMLHelper;

public class CimXMLSaveImpl extends fr.centralesupelec.edf.riseclipse.cim.util.cimxml.CimXMLSaveImpl {
    
    public CimXMLSaveImpl( XMLHelper helper ) {
        super( CimConstants.cimURI, helper );
    }

    public CimXMLSaveImpl( Map< ?, ? > options, XMLHelper helper, String encoding ) {
        super( CimConstants.cimURI, options, helper, encoding );
    }

    public CimXMLSaveImpl( Map< ?, ? > options, XMLHelper helper, String encoding, String xmlVersion ) {
        super( CimConstants.cimURI, options, helper, encoding, xmlVersion );
    }
    
}
