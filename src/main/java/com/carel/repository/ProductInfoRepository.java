
package com.carel.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.carel.persistence.entity.product.ProductInfo;

/**
 * Description:
 * @author Matthew Xu
 * @date Jul 16, 2020
 */
@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo, Integer> {

	ProductInfo findByType(String type);
	
	@Transactional
	void deleteByIdIn(Collection<Integer> ids);
	
}
