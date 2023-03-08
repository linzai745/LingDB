package io.github.lingdb.storage.record;

import java.io.Serializable;

/**
 * Tuple maintains information about the contents of a tuple. Tuples have a
 * specified schema specified by a TupleDesc object and contain Field objects
 * with the data for each field.
 */
public class Tuple implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public Tuple() {
        
    }
}
