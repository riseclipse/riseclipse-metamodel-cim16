/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim16.util;

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimXmlHelper;

public class Cim16XmlHelper extends AbstractCimXmlHelper {

    public Cim16XmlHelper( AbstractCim16Resource abstractCim16Resource ) {
        super( abstractCim16Resource );
    }

    @Override
    public String getURI( String prefix ) {
        String uri = super.getURI( prefix );
        if( Cim16Constants.cimURISharp.equals( uri )) return Cim16Constants.cimURI;
        return uri;
    }

}
