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

import java.util.Map;

import org.eclipse.emf.ecore.xmi.XMLHelper;

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimXmlSave;

public class Cim16XmlSave extends AbstractCimXmlSave {
    
    public Cim16XmlSave( XMLHelper helper ) {
        super( Cim16Constants.cimURI, helper );
    }

    public Cim16XmlSave( Map< ?, ? > options, XMLHelper helper, String encoding ) {
        super( Cim16Constants.cimURI, options, helper, encoding );
    }

    public Cim16XmlSave( Map< ?, ? > options, XMLHelper helper, String encoding, String xmlVersion ) {
        super( Cim16Constants.cimURI, options, helper, encoding, xmlVersion );
    }
    
}
