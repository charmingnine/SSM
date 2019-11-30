package a.com.serviceImpl;

import a.com.dao.ItemsMapper;
import a.com.po.Items;
import a.com.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Resource
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAllItems() {
        return itemsMapper.findAllItems();
    }

    @Override
    public Items findItemsById(Integer id) {
        return itemsMapper.findItemsById(id);
    }

    @Override
    public void saveAndUpdata(Items item) {
        itemsMapper.saveAndUpdata(item);
    }
}
