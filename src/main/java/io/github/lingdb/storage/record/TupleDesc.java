package io.github.lingdb.storage.record;

import java.io.Serializable;

/**
 * TupleDesc describes the schema of a tuple.
 */
public class TupleDesc implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * A help class to facilitate organizing the information of each field
     */
    public static class TDItem implements Serializable {
        private static final long serialVersionUID = 1L;

        /**
         * The type of field
         */
        public final Type fieldType;

        /**
         * The name of field
         */
        public final String fieldName;

        public TDItem(Type fieldType, String fieldName) {
            this.fieldType = fieldType;
            this.fieldName = fieldName;
        }

        @Override
        public String toString() {
            return fieldName + "(" + fieldType + ")";
        }
    }

    /**
     * @return
     *  An iterator which iterates over all the field TDItems
     *  that are included in this TupleDesc
     */
    public Iterable<TDItem> iterator() {
        // some code goes here
        return null;
    }
    
    
}
