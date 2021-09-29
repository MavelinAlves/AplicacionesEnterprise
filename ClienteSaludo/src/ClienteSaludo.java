import javax.naming.InitialContext;
import javax.naming.NamingException;
import com.servicios.CarritoDeSaludosBeanRemote;
import com.servicios.SaludoBeanRemote;

public class ClienteSaludo {

	public static void main(String[] args) throws NamingException {

		/*SaludoBeanRemote saludoBean = (SaludoBeanRemote) InitialContext
				.doLookup("ModuloEJB/SaludoBean!com.servicios.SaludoBeanRemote");*/

		/*System.out.println(saludoBean.saludar("Mavelin"));
		System.out.println("Excelente");*/

		CarritoDeSaludosBeanRemote carritoDeSaludosBean = (CarritoDeSaludosBeanRemote) InitialContext
				.doLookup("ModuloEJB/CarritoDeSaludosBean!com.servicios.CarritoDeSaludosBeanRemote");

		carritoDeSaludosBean.agregarSaludo("A");
		carritoDeSaludosBean.agregarSaludo("B");
		carritoDeSaludosBean.agregarSaludo("C");

		System.out.println(carritoDeSaludosBean.obtenerSaludos());
	}
}
