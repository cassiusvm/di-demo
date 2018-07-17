package br.eti.cvm.didemo.examplebeans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeJmsBroker {
	private String username;
	private String password;
	private String url;
}