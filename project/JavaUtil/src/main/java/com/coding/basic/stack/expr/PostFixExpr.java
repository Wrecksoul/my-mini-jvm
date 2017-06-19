package com.coding.basic.stack.expr;

import java.util.ArrayList;
import java.util.List;

public class PostFixExpr {
	String expr = null;
	private List<Token> tokenList = new ArrayList<>();

	public PostFixExpr(String expr) {
		this.expr = expr;
	}

	public PostFixExpr(List<Token> tokenList) {
		this.tokenList = tokenList;
	}

	public PostFixExpr(String expr, List<Token> tokenList) {
		this.expr = expr;
		this.tokenList = tokenList;
	}

	public float evaluate() {

		return 0.0f;
	}
}
