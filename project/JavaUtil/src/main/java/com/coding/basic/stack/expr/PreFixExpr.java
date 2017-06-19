package com.coding.basic.stack.expr;

import java.util.ArrayList;
import java.util.List;

public class PreFixExpr {
	String expr = null;
	private List<Token> tokenList = new ArrayList<>();

	public PreFixExpr(String expr) {
		this.expr = expr;
	}

	public PreFixExpr(List<Token> tokenList) {
		this.tokenList = tokenList;
	}

	public PreFixExpr(String expr, List<Token> tokenList) {
		this.expr = expr;
		this.tokenList = tokenList;
	}
	public float evaluate() {
		
		return 0.0f;
	}
}
