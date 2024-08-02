package com.express.mvc;

import com.express.mvc.model.Note;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class TimingDynamicInvocationHandler implements InvocationHandler {
    private final List proxied;
    private Object target;

    public static void main(String[] args) {
        
        List<Note> notes = new ArrayList<>();
        notes.add(new Note("A","Apple"));
        notes.add(new Note("B","Book"));
        notes.add(new Note("C","Crab"));
        
        notes.stream()
                .forEach(System.out::println);
        
 //       System.out.println("wordLengths: " + wordLengths);
    }
    
    public static void proxy(){
 //        List proxy = (List) Proxy.newProxyInstance(
//                TimingDynamicInvocationHandler.class.getClassLoader(),
//                new Class[] {List.class}, 
//                new TimingDynamicInvocationHandler(new ArrayList()));
//        proxy.add("Barney");
//        proxy.add("Homer");
//        proxy.add("Moe");
//        System.out.println("Proxy 1: " + proxy);
//        proxy.remove("Homer");
//        proxy.remove("Moe");
//        
//        Class[] me = new Class[] {List.class};
//
//        System.out.println("Proxy 2: " + Arrays.toString(me));
//        
//        proxy.add(proxy.contains("Homer"));
//        proxy.add(proxy.equals(proxy));
//        
//        System.out.println("Proxy 3: " + proxy);       
    }
    
        TimingDynamicInvocationHandler(List proxied){
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("remove")){
            return false;
        }

        if(method.getName().startsWith(""+(char)99) || method.getName().startsWith(""+(char)101)){
            return false;
        }
        
        return method.invoke(proxied, args);
    }   
}
//    nestedList: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
//    flattenedList: [1, 2, 3, 4, 5, 6, 7, 8, 9]