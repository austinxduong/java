package ET;

public class ObjectComparison {
   public static boolean ObjComparison(Object firObject, Object secObject) {
    return firObject == null || secObject == null || !firObject.equals(secObject) ? false : true;
   } 
}

