import com.alibaba.nacos.api.cmdb.pojo.Entity;
import com.alibaba.nacos.api.cmdb.pojo.EntityEvent;
import com.alibaba.nacos.api.cmdb.pojo.Label;
import com.alibaba.nacos.api.cmdb.spi.CmdbService;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/7 16:41
 */
public class ExampleCmdbServiceImpl implements CmdbService {
    @Override
    public Set<String> getLabelNames() {
        return null;
    }

    @Override
    public Set<String> getEntityTypes() {
        return null;
    }

    @Override
    public Label getLabel(String s) {
        return null;
    }

    @Override
    public String getLabelValue(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Map<String, String> getLabelValues(String s, String s1) {
        return null;
    }

    @Override
    public Map<String, Map<String, Entity>> getAllEntities() {
        return null;
    }

    @Override
    public List<EntityEvent> getEntityEvents(long l) {
        return null;
    }

    @Override
    public Entity getEntity(String s, String s1) {
        return null;
    }
}
