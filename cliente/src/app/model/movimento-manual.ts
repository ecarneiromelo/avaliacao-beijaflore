export class MovimentoManual {

    mes: number = 0 ;
    ano: number = 0;
    
    static fromJson(json: any): MovimentoManual {
        return Object.assign(new MovimentoManual(), json);
    }
}
