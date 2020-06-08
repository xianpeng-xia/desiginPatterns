package org.example.behavioralPattern.chainOfResponsibility;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 17:37
 */
public class HRRequestHandle implements RequestHandle {


    @Override
    public void handleRequest(Request request) {
        if(request instanceof DimissionRequest){
            System.out.println("离职，人事审批！");
        }
        System.out.println("请求完毕！");
    }
}
