package br.uefs.larsid.iot.soft.services;

/**
 * @author Allan Capistrano
 * @version 1.0.0
 */
public interface ILedgerReader {
  public void getMessageByIndex(String index);
}