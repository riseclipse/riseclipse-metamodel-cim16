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

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.xml.sax.helpers.DefaultHandler;

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimXmlLoad;

public class Cim16XmlLoad extends AbstractCimXmlLoad {

    public Cim16XmlLoad( XMLHelper helper ) {
        super( helper );
    }

    @Override
    protected DefaultHandler makeDefaultHandler() {
        return new Cim16XmlHandler( resource, helper, options );
    }

}
