package main.java;

import com.basra.game.exception.mappers.DataNotFoundExceptionMapper;
import com.basra.game.resources.userRestResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

//Defines the base URI for all resource URIs.
@ApplicationPath("/")
//The java class declares root resource and provider classes
public class JerseyApplication extends Application {
    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( userRestResource.class );
        h.add( DataNotFoundExceptionMapper.class );
        return h;
    }
}