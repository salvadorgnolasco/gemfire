package loader;

import java.util.Arrays;
import java.util.List;

import com.gemstone.gemfire.cache.Region;
import com.gemstone.gemfire.cache.client.ClientCache;
import com.gemstone.gemfire.cache.client.ClientCacheFactory;
import com.gemstone.gemfire.pdx.JSONFormatter;
import com.gemstone.gemfire.pdx.PdxInstance;

import model.Customer;

public class CustomerJsonCacheClient {

  public static final String EXAMPLE_REGION_NAME = "Customers";

  public static void main(String[] args) {

    System.out.println("=== Creando lista de clientes ===");
    List<Customer> customers = Arrays.asList(
      new Customer("13007", "Salvador Gonzalez Nolasco",
      "salvador.gonzalez@softtek.com", "5543494708", "1982-11-11", Integer.valueOf(1)), 
      new Customer("14008", "Yesica Santillan Lomas", 
      "salymoon@hotmail.com","5543494700", "1981-05-29", Integer.valueOf(1))
    );
    
    System.out.println("=== Intentando conexión con gemfire ===");
    
    ClientCache cache = new ClientCacheFactory().set("name", "CustomerJsonCacheClient")
      .set("cache-xml-file", "xml/JsonClient.xml").create();
    Region<String, PdxInstance> customerRegion = cache.getRegion(EXAMPLE_REGION_NAME);

    System.out.println("=== Insertando datos ===");
    customers
      .stream()
      .peek(c -> System.out.println("\nCustomer to add: " + c))
      .forEach(c -> customerRegion.put(c.getCustomerId(), JSONFormatter.fromJSON(c.toString() )));
    
    System.out.println("=== Recuperando datos ===");
    String getJsonCustomer = JSONFormatter.toJSON(customerRegion.get("13007"));
    System.out.println(getJsonCustomer);
    
  }
}
