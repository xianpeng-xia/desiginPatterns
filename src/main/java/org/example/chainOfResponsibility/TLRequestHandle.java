package org.example.chainOfResponsibility;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 17:42
 */
public class TLRequestHandle implements RequestHandle {

    private RequestHandle rh;

    public TLRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }

    @Override
    public void handleRequest(Request request) {
        if (request instanceof LeaveRequest) {
            System.out.println("请假，项目组长审批");
        } else {
            rh.handleRequest(request);
        }
    }
}
