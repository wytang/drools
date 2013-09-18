package org.drools.factmodel.traits;

import org.drools.WorkingMemory;

import java.io.Externalizable;

public interface TraitFieldTMS extends Externalizable {

    public void init( WorkingMemory wm );

    public void registerField( Class domainKlass, String name );

    public void registerField( Class domainKlass, String name, Class klass, Object value, String initial );

    public Object set( String name, Object value, Class klass );

    public Object get( String name, Class klass );

    public boolean isManagingField( String name );

    public Object donField( String name, TraitType trait, String value, Class klass );

    public boolean needsInit();

    public long getAndResetModificationMask();
}
