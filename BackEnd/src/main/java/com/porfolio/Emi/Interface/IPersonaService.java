
package com.porfolio.Emi.Interface;
 
import com.porfolio.Emi.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePesona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
}
