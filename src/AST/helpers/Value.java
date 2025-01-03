package AST.helpers;

import AST.Space;
import AST.array.Array;
import AST.array.ArrayAccess;
import AST.object.Object;
import AST.object.ObjectInstantiation;

public class Value {
    private Primary primary;
    private Array array;
    private ArrayAccess arrayAccess;
    private Object object;
    private ObjectInstantiation objectInstantiation;

    public Primary getPrimary() {
        return primary;
    }

    public void setPrimary(Primary primary) {
        this.primary = primary;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public ArrayAccess getArrayAccess() {
        return arrayAccess;
    }

    public void setArrayAccess(ArrayAccess arrayAccess) {
        this.arrayAccess = arrayAccess;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ObjectInstantiation getObjectInstantiation() {
        return objectInstantiation;
    }

    public void setObjectInstantiation(ObjectInstantiation objectInstantiation) {
        this.objectInstantiation = objectInstantiation;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Value: {\n");

        Space.currentValue++;

        // Append primary
        if (primary != null) {
            stringBuilder.append(primary).append(",\n");
        }

        // Append array
        if (array != null) {
            stringBuilder.append(array).append(",\n");
        }

        // Append arrayAccess
        if (arrayAccess != null) {
            stringBuilder.append(arrayAccess).append(",\n");
        }

        // Append object
        if (object != null) {
            stringBuilder.append(object).append(",\n");
        }

        // Append objectInstantiation
        if (objectInstantiation != null) {
            stringBuilder.append(objectInstantiation).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }

}
