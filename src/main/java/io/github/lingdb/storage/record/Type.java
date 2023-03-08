package io.github.lingdb.storage.record;

import java.io.Serializable;

/**
 * Class representing a type in DB.
 * Types are static objects defined by this class; hence, the Type constructor is private.
 */
public enum Type implements Serializable {
    
    public static final int STRING_LEN = 128;

    /**
     * 
     * @return
     *  the number of bytes required to store a field of this type.
     */
    public abstract int getLen();
    
    
}
