package ac.aston.mobile.network;

import java.io.Serializable;
import java.util.logging.Logger;

public class Pack implements Serializable{
    final static Logger logger = Logger.getLogger(Pack.class.getName());
    private static final long serialVersionUID = 1;
    String functionName = null;
    Class stateType = null;
    Object state = null;
    Object[] paramValues = null;
    Class[] paramTypes = null;

    public Pack(String functionName, Class stateType, Object state, Object[] paramValues, Class[] FuncDTypes) {
        this.functionName = functionName;
        this.stateType = stateType;
        this.state = state;
        this.paramValues = paramValues;
        this.paramTypes = FuncDTypes;
    }

    public String getfunctionName(){
        return functionName;
    }
    
    public Class getstateType(){
        return stateType;
    }

    public Object[] getparamValues(){
        return paramValues;
    }

    public Class[] getparamTypes(){
        return paramTypes;
    }

    public Object getstate(){
        return state;
    }
    
}
