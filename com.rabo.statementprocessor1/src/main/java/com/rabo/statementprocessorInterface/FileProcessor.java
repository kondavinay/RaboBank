package com.rabo.statementprocessorInterface;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public interface FileProcessor {
public String[] process() throws IOException, SAXException, ParserConfigurationException, ClassNotFoundException;
}
