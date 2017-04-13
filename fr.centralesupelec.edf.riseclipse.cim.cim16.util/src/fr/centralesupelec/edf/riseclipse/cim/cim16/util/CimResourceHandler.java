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

import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.ecore.xmi.XMLResource;

public class CimResourceHandler extends fr.centralesupelec.edf.riseclipse.cim.util.cimxml.CimResourceHandler {
    
    static final String xmlDeclaration = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>\n";

    @Override
    public void preSave( XMLResource resource, OutputStream outputStream, Map< ?, ? > options ) {
        super.preSave( resource, outputStream, options, CimConstants.cimURI );
    }

}
