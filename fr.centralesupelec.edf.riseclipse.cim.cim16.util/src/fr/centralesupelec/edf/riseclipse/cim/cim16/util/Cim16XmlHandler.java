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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimXmlHandler;

public class Cim16XmlHandler extends AbstractCimXmlHandler {

    public Cim16XmlHandler( XMLResource xmiResource, XMLHelper helper, Map< ?, ? > options ) {
        super( Cim16Constants.cimURI, xmiResource, helper, options );
    }

    // This method needs the specific URI
    @Override
    protected boolean setEnumValue( EObject object, EStructuralFeature feature, String resource ) {
        if( resource.startsWith( Cim16Constants.cimURISharp ) ) {
            int enumNameLength = feature.getEType().getName().length();
            // do not call fr.centralesupelec.riseclipse.cim.util.cimxml.CimXMLHandler.setFeatureValue to avoid infinite recursion
            // call instead org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler.setFeatureValue
            // We use the fact that SAXXMLHandler.setFeatureValue( EObject, EStructuralFeature, Object ) call
            // SAXXMLHandler.setFeatureValue( EObject, EStructuralFeature, Object, -1 )
            super.setFeatureValue( object, feature,
                  resource.substring( Cim16Constants.cimURISharp.length() + enumNameLength + 1 ), -1 );
            return true;
        }
        return false;
    }

}
