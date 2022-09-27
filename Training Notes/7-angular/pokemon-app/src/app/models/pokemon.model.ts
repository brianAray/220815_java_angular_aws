export interface Pokemon{
    id: number;
    name: string;
    base_experience: number;
    rating?: number | undefined;
    sprites:{
        front_default: string;
    }
}