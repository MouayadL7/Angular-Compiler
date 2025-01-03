package AST.array;

import AST.Space;
import AST.helpers.Value;

import java.util.ArrayList;
import java.util.List;

public class Array {
    List<Value> valueList;

    public Array() {
        this.valueList = new ArrayList<>();
    }

    public List<Value> getValueList() {
        return valueList;
    }

    public void setValueList(List<Value> valueList) {
        this.valueList = valueList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Array: {\n");

        if (!valueList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("values: [\n");
            Space.currentValue++;
            for (Value property : valueList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
