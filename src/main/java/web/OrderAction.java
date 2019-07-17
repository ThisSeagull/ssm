package web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.Orders;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.OrderService;

import java.io.File;
import java.util.List;

@Controller
public class OrderAction {
    @Autowired
     private OrderService orderService;
    Logger log = (Logger) LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @RequestMapping(value = "/list")
    public String getList(ModelMap map,@RequestParam(defaultValue = "1")int page){
        map.put("name", "kimi");
        PageHelper.startPage(page,10);
        List<Orders> list =orderService.listAllOrders();
        map.put("list",list);
        map.put("pageInfo",new PageInfo<>(list));
        return "/list";
    }
}
