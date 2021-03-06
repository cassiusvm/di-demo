package br.eti.cvm.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.eti.cvm.didemo.controllers.ConstructorInjectedController;
import br.eti.cvm.didemo.controllers.MyController;
import br.eti.cvm.didemo.controllers.PropertyInjectedController;
import br.eti.cvm.didemo.controllers.SetterInjectedController;
import br.eti.cvm.didemo.examplebeans.FakeDataSource;
import br.eti.cvm.didemo.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

		System.out.println("-----------------------");
		FakeDataSource fakeDatasource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println("Username: " + fakeDatasource.getUsername());
		System.out.println("DBURL: " + fakeDatasource.getDburl());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println("JMS Username: " + fakeJmsBroker.getUsername());
	}
}
