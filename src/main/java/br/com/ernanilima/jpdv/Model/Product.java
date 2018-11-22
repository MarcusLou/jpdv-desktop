package br.com.ernanilima.jpdv.Model;

/**
 * Model de produto
 *
 * @author Ernani Lima
 */
public class Product {

    // Variaveis do produto
    private int id;
    private String description;
    private String descriptionCoupon;
    private long barcode;
    private float salePrice;
    private float promotionalPrice;
    private Unit mUnit;

    // Construtor vazio
    public Product() {}

    /**
     * @return int - ID do produto
     */
    public int getId() {
        return id;
    }

    /**
     * Atribui o ID do produto na variavel "{@link #id}"
     * @param id int - ID do produto
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String - Descricao do produto
     */
    public String getDescription() {
        return description;
    }

    /**
     * Atribui a descricao do procuto na variavel "{@link #description}"
     * @param description String - Descricao do produto
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return String - Descricao de cupom do produto
     */
    public String getDescriptionCoupon() {
        return descriptionCoupon;
    }

    /**
     * Atribui a descricao de cupom do produto na variavel "{@link #descriptionCoupon}"
     * @param descriptionCoupon String - Descricao de cupom do produto
     */
    public void setDescriptionCoupon(String descriptionCoupon) {
        this.descriptionCoupon = descriptionCoupon;
    }

    /**
     * @return long - Codigo de barras do produto
     */
    public long getBarcode() {
        return barcode;
    }

    /**
     * Atribui o codigo de barras do produto na variavel "{@link #barcode}"
     * @param barCode long - Codigo de barras do produto
     */
    public void setBarcode(long barCode) {
        this.barcode = barCode;
    }

    /**
     * @return float - Preco de venda do produto
     */
    public float getSalePrice() {
        return salePrice;
    }

    /**
     * Atribui o preco de venda do produto na variavel "{@link #salePrice}"
     * @param salePrice float - Preco de venda do produto
     */
    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return float - Preco promocional do produto
     */
    public float getPromotionalPrice() {
        return promotionalPrice;
    }

    /**
     * Atribui o preco promocional do produto na variavel "{@link #promotionalPrice}"
     * @param promotionalPrice float - Preco promocional do produto
     */
    public void setPromotionalPrice(float promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    /**
     * @return Unit - Unidade de pedida do produto
     */
    public Unit getmUnits() {
        return mUnit;
    }

    /**
     * Atribui a unidade de medita na Classe Model "{@link Unit}"
     * @param mUnits {@link Unit} - Unidade de medida do produto
     */
    public void setmUnits(Unit mUnits) {
        this.mUnit = mUnits;
    }
}
