export class SelectServiceDetail {
    primaryIndustryId: string;
    primaryIndustryName: string;
    skus: Array<Sku>;
}

export class Sku {
    offeringId: number;
    sku: string;
    skuid : string;
    skuName: string;
    categoryName:string;
    taskComments:string;
    descr:string;
    skuPrices: Array<SkuPrices>;
}

export class SkuPrices {
    isSelected: boolean;
    id: number;
    price: string;
    priceValid: boolean;
    dailyLimit: string;
    dailyLimitValid: boolean;
}