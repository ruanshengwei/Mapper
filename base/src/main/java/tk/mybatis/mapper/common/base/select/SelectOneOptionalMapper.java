package tk.mybatis.mapper.common.base.select;

import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.provider.base.BaseSelectProvider;

import java.util.Optional;

/**
 *
 * @param <T>
 */
@RegisterMapper
public interface SelectOneOptionalMapper<T> {

    @SelectProvider(type = BaseSelectProvider.class, method = "dynamicSQL")
    Optional<T> selectOptional(Object key);
}
