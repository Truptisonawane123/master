package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	@RequestMapping(value="")
	

}
