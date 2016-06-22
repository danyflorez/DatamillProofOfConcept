package com.tech.datamill.main;

import foundation.stack.datamill.http.Method;
import foundation.stack.datamill.http.Server;

public class RunService {

	public static void main(String[] args) {
	    // Note the Server class here is foundation.stack.datamill.http.Server
	    Server server = new Server(
	        rb -> rb.ifMethodAndUriMatch(Method.GET, "/status", r -> r.respond(b -> b.ok()))
	            .elseIfMethodAndUriMatch(Method.GET, "/hello", r -> r.respond(b -> b.ok("Hello world!")))
	            .orElse(r -> r.respond(b -> b.notFound())));

	    server.listen(8081);
	}
}
