/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EstateAgent;

/**
 *
 * @author ROHIL
 */
public interface IEstateAgent {
    double calculateCommission(String PropertyPrice, String agentCommssion);
    boolean ValidateData(Data dataToValidate);
    
}
