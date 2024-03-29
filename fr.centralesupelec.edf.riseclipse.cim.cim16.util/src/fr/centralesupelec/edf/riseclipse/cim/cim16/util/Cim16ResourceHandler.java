/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim16.util;

import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.ecore.xmi.XMLResource;

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimResourceHandler;

public class Cim16ResourceHandler extends AbstractCimResourceHandler {
    
    static final String xmlDeclaration = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>\n";

    @Override
    public void preSave( XMLResource resource, OutputStream outputStream, Map< ?, ? > options ) {
        super.preSave( resource, outputStream, options, Cim16Constants.cimURISharp );
    }

}
