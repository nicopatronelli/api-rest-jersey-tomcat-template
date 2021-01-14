package api.example;


import org.jvnet.hk2.annotations.Service;

import lombok.Getter;

@Service
@Getter
public class Raichu {
	private int number = 26;
	private String name = "raichu";
}
