package org.example.main;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HDU_WS
 * @Classname Scope
 * @Description TODO
 * @Date 2021/8/13 16:47
 * @Created by TheKing_Shun
 */

public class Scope {
    private Scope parent;
    private Map<String, WSValue> variables;
    private boolean isFunction;

    public Scope() {
        this(null, false);
    }

    public Scope(Scope p, boolean function) {
        parent = p;
        variables = new HashMap<>();
        isFunction = function;
    }

    public void assignParam(String var, WSValue value) {
        variables.put(var, value);
    }

    public void assign(String var, WSValue value) {
        if (resolve(var, !isFunction) != null) {
            this.reAssign(var, value);
        }else{
            variables.put(var, value);
        }
    }

    private boolean isGlobalScope() {
        return parent == null;
    }
    public Scope parent() {
        return parent;
    }

    private void reAssign(String identifier, WSValue value) {
        if (variables.containsKey(identifier)) {
            variables.put(identifier, value);
        } else if (parent != null) {
            parent.reAssign(identifier, value);
        }
    }

    public WSValue resolve(String var) {
        return resolve(var, true);
    }

    private WSValue resolve(String var, boolean checkParent) {
        WSValue value = variables.get(var);
        if (value != null) {
            return value;
        } else if (checkParent && !isGlobalScope()) {
            return parent.resolve(var, !parent.isFunction);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,WSValue> var: variables.entrySet()) {
            sb.append(var.getKey()).append("->").append(var.getValue()).append(",");
        }
        return sb.toString();
    }
}






























